package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 *
 * @author Валерий Арыкин (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Fit {
    /**
     * Идеальный вес для мужщины.
     * (рост в сантиметрах – 100) · 1,15
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15d;
    }

    /**
     * Идеальный вес для женщины.
     * (рост в сантиметрах – 110) · 1,15
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15d;
    }
}
