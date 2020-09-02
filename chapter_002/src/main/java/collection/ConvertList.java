package collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] arr : list) {
            for (int j : arr) {
                rsl.add(j);
            }
        }
        return rsl;
    }
}