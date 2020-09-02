package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;


public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 2);
        Point p3 = new Point(2, 0);
        Triangle triangle = new Triangle(p1, p2, p3);
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void period() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 2);
        Point p3 = new Point(2, 0);
        Triangle triangle = new Triangle(p1, p2, p3);
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p1.distance(p3);
        double result = triangle.period(a, b, c);
        double expected = 36.5d;
        assertThat(result, closeTo(expected, 36.5));
    }

    @Test
    public void existWhenWrong() {
        Triangle triangle = new Triangle();
        boolean result = triangle.exist(1, 2, 3); // такого не может быть
        assertFalse(result);
    }

    @Test
    public void existWhenExist() {
        Triangle triangle = new Triangle();
        boolean result = triangle.exist(2, 3, 4); // такой существует
        assertTrue(result);
    }
}