package ru.job4j.array;


/**
 * Сортировка массива методом пузырька.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class BubbleSort {
    /**
     * Проверяет все ли элементы массива одинаковые.
     *
     * @param array Массив элементов типа int.
     * @return Отсортированный массив.
     */
    public int[] sort(int[] array) {
        for (int a = array.length - 1; a > 0; a--) {
            for (int i = 1; i <= a; i++) {
                int current = array[i];
                int previos = array[i - 1];
                if (previos > current) {
                    array[i] = previos;
                    array[i - 1] = current;
                }
            }
        }
        return array;
    }
}
