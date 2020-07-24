package collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        for (int i = 0; i < left.length() & i < right.length(); i++) {
            result = Character.compare(left.charAt(i), right.charAt(i));
            if (result != 0) break;
        }
        if (result == 0 && (left.length() > right.length())) {
            result = 1;
        } else if (result == 0 && (left.length() < right.length())) {
            result = -1;
        }
        return result;
    }
}
