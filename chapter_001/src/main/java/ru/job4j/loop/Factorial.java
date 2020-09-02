package ru.job4j.loop;

/**
 * Вычисление факториала.
 *
 * @author Валерий Арыкин (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Factorial {
    /**
     * Выполняет подсчет суммы чётных чисел в диапазоне.
     *
     * @param n число типа long, факториал которого вычисляем.
     * @return факториал числа, типа long.
     */
    public long calc(long n) {
        long sum = 1;
        for (long i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
}
