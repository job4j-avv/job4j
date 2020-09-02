package ru.job4j.condition;

import static java.lang.Math.*;

/**
 * Программа расчета расстояния между точками в системе координат.
 *
 * @author Валерий Арыкин (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Point {

    private int x;
    private int y;
    private int z;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     *
     * @param first  координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструтор, который принимает начальное состояние объекта "точка", в трехмерном пространстве.
     *
     * @param x координата x
     * @param y координата y
     * @param z координата z
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Расчет расстояния между точками.
     *
     * @param that - другой объект точка.
     * @return расстояние.
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Расчет расстояния между точками.
     *
     * @param that - другой объект точка.
     * @return расстояние.
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
}