package collection.user;

import java.util.Comparator;

public class UserIncrByAge implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return Integer.compare(u1.getAge(), u2.getAge());
    }
}