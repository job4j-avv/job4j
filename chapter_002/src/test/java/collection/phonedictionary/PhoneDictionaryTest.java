package collection.phonedictionary;

import java.util.ArrayList;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void find() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Nikola", "Piterskyj", "883937", "Piterburg"));
        phones.add(new Person("Alena", "Kozlovich", "0393773", "Smolensk"));
        ArrayList<Person> persons = phones.find("37");
        int i = 0;
        for (Person p : persons) {
            System.out.println(String.format("%d > %s       %s      %s      %s", ++i, p.getName(), p.getSurname(), p.getPhone(), p.getAddress()));
        }
        assertThat(persons.get(0).getSurname(), is("Piterskyj"));
    }
}