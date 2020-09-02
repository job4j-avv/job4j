package ru.job4j.array;

/**
 * Переворот массива.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Turn {

    /**
     * Переворачивает массив.
     *
     * @param array Массив.
     * @return Новый перевернутый массив.
     */
    public int[] back(int[] array) {
        int middle = (array.length / 2);
        for (int i = 0; i < middle; i++) {
            int tail = array.length - i - 1;
            int temp = array[i];
            array[i] = array[tail];
            array[tail] = temp;
        }
        return array;
    }
}