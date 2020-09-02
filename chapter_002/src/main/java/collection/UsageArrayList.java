package collection;

import java.util.ArrayList;

/**
 * кдасс работает с колекцией ArrayList без обобщений.
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Petr");
        arr.add("Ivan");
        arr.add("Stepan");
        for (String item : arr) {
            System.out.println(item);
        }
    }
}
