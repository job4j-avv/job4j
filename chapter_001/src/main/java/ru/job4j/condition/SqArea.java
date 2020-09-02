package ru.job4j.condition;

/**
 * Стороны прямоугольника.
 *
 * @author Валерий Арыкин (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class SqArea {

    /**
     * Расчет площади прямоугольника.
     * Расчитывает по формуле:
     *     s = w * h
     * дальше преобразуется к виду:
     *     s = h^2 * k
     *     s = k * ((p / (2(k+1))) ^ 2)
     *
     * @param p периметр.
     * @param k коэффициент.
     * @return площадь.
     */
    public int square(int p, int k) {
        return (int) (k * (Math.pow(p / (2 * (k + 1)), 2)));
    }
}
