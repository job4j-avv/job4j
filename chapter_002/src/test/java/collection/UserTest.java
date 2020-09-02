package collection;

import collection.user.*;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Ivan", 33));
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Ivan", 33)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameDecr() {
        Comparator<User> cmpName = new UserIncrByName();
        int rsl = cmpName.compare(
                new User("Avanes", 2),
                new User("Roman", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameIncr() {
        Comparator<User> cmpName = new UserDecrByName();
        int rsl = cmpName.compare(
                new User("Roman", 2),
                new User("Avanes", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByAgeDecr() {
        Comparator<User> cmpName = new UserDecrByAge();
        int rsl = cmpName.compare(
                new User("Avanes", 2),
                new User("Roman", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByAgeIncr() {
        Comparator<User> cmpName = new UserIncrByAge();
        int rsl = cmpName.compare(
                new User("Roman", 1),
                new User("Avanes", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    /* комбинированные компараторы */
    @Test
    public void whenCompatorByNameAndAge() {
        Comparator<User> cmp = new UserIncrByName().thenComparing(new UserIncrByAge());
        int rsl = cmp.compare(
                new User("Avanes", 1),
                new User("Avanes", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndAge2() {
        Comparator<User> cmp = new UserDecrByName().thenComparing(new UserDecrByAge());
        int rsl = cmp.compare(
                new User("Roman", 2),
                new User("Roman", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}