package ru.job4j.condition;

/**
 * Максимум из трех чисел.
 *
 * @author Валерий Арыкин (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class MultiMax {
    /**
     * Возвращает максимальное число.
     *
     * @param first  число аргумент.
     * @param second число аргумент.
     * @param third  число аргумент.
     * @return результат - целое число.
     */
    public int max(int first, int second, int third) {
        int temp = (first > second) ? first : second;
        return (temp > third) ? temp : third;
    }
}