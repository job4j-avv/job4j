package ru.job4j.condition;

/**
 * Вычисление площади треугольника.
 *
 * @author Валерий Арыкин (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    /**
     * Конструктор класса.
     */
    public Triangle() {
    }

    /**
     * Конструктор класса.
     *
     * @param a точка a
     * @param b точка b
     * @param c точка c
     */
    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     * <p>
     * Формула.
     * <p>
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полуперимента.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * <p>
     * Необходимым и достаточным условием существования треугольника является выполнение следующих неравенств:
     * a+b>c, a+c>b, b+c>a, (a>0, b>0, c>0), где a, b и с - длины сторон треугольника.
     * <p>
     * Другими словами, треугольник существует тогда и только тогда,
     * когда сумма любых двух его сторон больше третьей стороны.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return значение - треугольник возможен или нет.
     */
    public boolean exist(double a, double c, double b) {
        return (b + c) > a && (a + c) > b && (a + b) > c;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     * <p>
     * Формула.
     * <p>
     * √ p *(p - a) * (p - b) * (p - c)
     * <p>
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double distanceAtoB = this.first.distance(this.second);
        double distanceBtoC = this.second.distance(this.third);
        double distanceAtoC = this.first.distance(this.third);
        double p = period(distanceAtoB, distanceBtoC, distanceAtoC);
        if (this.exist(distanceAtoB, distanceBtoC, distanceAtoC)) {
            return Math.sqrt(p * (p - distanceAtoB) * (p - distanceBtoC) * (p - distanceAtoC));
        }
        return rsl;
    }
}