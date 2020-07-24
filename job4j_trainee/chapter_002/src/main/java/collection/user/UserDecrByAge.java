package collection.user;

import java.util.Comparator;

public class UserDecrByAge implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return Integer.compare(u2.getAge(), u1.getAge());
    }
}
