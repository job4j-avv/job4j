package collection.user;

import java.util.Comparator;

public class UserDecrByName implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return u2.getName().compareTo(u1.getName());
    }
}
