package ru.job4j.array;

/**
 * Проверка элементов массива.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Check {
    /**
     * Проверяет все ли элементы массива одинаковые.
     *
     * @param data Массив элементов boolean.
     * @return Значение true, если все одинаковые иначе  false.
     */
    public boolean mono(boolean[] data) {
        boolean first = data[0];
        boolean result = true;
        int i = 1;
        while (i < data.length) {
            if (first != data[i]) {
                result = false;
                break;
            }
            i++;
        }
        return result;
    }
}
