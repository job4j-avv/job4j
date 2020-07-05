package ru.job4j.calculator;

/**
 * Предоставляет методы для осуществления элементарных математических операций.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Calculator {

    /**
     * Метод сложения двух вещественных чисел.
     *
     * @param first  число-операнд типа double
     * @param second число-операнд типа double
     * @return значение типа double
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Метод вычитания двух вещественных чисел.
     *
     * @param first  число-операнд типа double
     * @param second число-операнд типа double
     * @return значение типа double
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Метод деления двух вещественных чисел.
     *
     * @param first  число-операнд типа double
     * @param second число-операнд типа double
     * @return значение типа double
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     * Метод перемножения двух вещественных чисел.
     *
     * @param first  число-операнд типа double
     * @param second число-операнд типа double
     * @return значение типа double
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}