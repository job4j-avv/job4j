package ru.job4j.array;

import java.util.Arrays;

/**
 * Удаление дубликатов в массиве.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class ArrayDuplicate {
    /**
     * Удаление дубликатов в массиве.
     *
     * @param array Массив с возможными дубликатами.
     * @return Массив без дубликатов.
     */
    public String[] remove(String[] array) {
        int tailIndex = 0;
        for (int a = 0; a < array.length - tailIndex; a++) {
            String current = array[a];
            for (int i = a + 1; i < array.length - tailIndex; i++) {
                String temp = array[i];
                if (current.equals(temp)) {
                    array[i] = array[array.length - tailIndex - 1];
                    array[array.length - tailIndex - 1] = temp;
                    tailIndex++;
                }

            }
        }
        return Arrays.copyOf(array, array.length - tailIndex);
    }
}
