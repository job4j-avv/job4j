package ru.job4j.array;

/**
 * Запоснение массива.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Square {

    /**
     * Заполняет массив.
     *
     * @param bound Размер массива.
     * @return массив.
     */
    public int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 1; i <= bound; i++) {
            result[i - 1] = i * i;
        }
        return result;
    }
}
