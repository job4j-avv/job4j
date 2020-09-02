package ru.job4j.loop;

/**
 * Подсчет суммы чётных чисел в диапазоне.
 *
 * @author Валерий Арыкин (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Counter {
    /**
     * Выполняет подсчет суммы чётных чисел в диапазоне.
     *
     * @param start  начало диапазона.
     * @param finish конец диапазона.
     * @return сумма.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
