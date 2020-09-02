package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void whenZeroAndTenThenTen() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 10);
        double result = point1.distance(point2);
        assertThat(result, is(10D));
    }

    @Test
    public void whenZeroAndZero() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);
        double result = point1.distance(point2);
        assertThat(result, is(0D));
    }

    @Test
    public void when3D() {
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(1, 3, 7);
        double result = point1.distance3d(point2);
        assertThat(result, is(7.681_145_747_868_608d));
    }
}