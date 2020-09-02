package ru.job4j.condition;

/**
 * Максимум из двух чисел.
 *
 * @author Валерий Арыкин (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Max {
    /**
     * Возвращает максимальное число.
     *
     * @param left  число аргумент.
     * @param right число аргумент.
     * @return результат - целое число.
     */
    public int max(int left, int right) {
        return left > right ? left : right;
    }

    /**
     * Возвращает максимальное число.
     *
     * @param one   число аргумент.
     * @param two   число аргумент.
     * @param three число аргумент.
     * @return результат - целое число.
     */
    public int max(int one, int two, int three) {
        int result;
        result = max(one, two);
        return max(result, three);
    }


    /**
     * Возвращает максимальное число.
     *
     * @param one   число аргумент.
     * @param two   число аргумент.
     * @param three число аргумент.
     * @param four  число аргумент.
     * @return результат - целое число.
     */
    public int max(int one, int two, int three, int four) {
        int result;
        result = max(one, two, three);
        return max(result, four);
    }
}