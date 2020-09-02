package ru.job4j.array;

/**
 * Поиск перебором.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class FindLoop {

    /**
     * Ищет елемент в массиве
     *
     * @param el   Елемент который ищем
     * @param data Массив в котором выполняется поиск.
     * @return индекс найденного елемента в массиве. Если не найден вернет -1.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}