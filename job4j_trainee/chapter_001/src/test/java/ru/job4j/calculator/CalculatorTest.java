package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class CalculatorTest {

    final double delta1 = 1e-10;
    final double delta2 = 1;

    @Test
    public void add() {
        Calculator calc = new Calculator();
        double expected = 3.1415926535d;
        double result = calc.add(3d, 0.1415926535d);
        assertThat(result, is(expected));
    }

    @Test
    public void subtract() {
        Calculator calc = new Calculator();
        double expected = 3d;
        double result = calc.subtract(3.1415926535d, 0.1415926535d);
        assertThat(result, is(expected));
    }

    @Test
    public void div() {
        Calculator calc = new Calculator();
        double expected = 3.1415926535d;
        double result = calc.div(31_415_926_535d, 10_000_000_000d);
        assertThat(result, closeTo(expected, delta1));
    }


    @Test
    public void multiple() {
        Calculator calc = new Calculator();
        double expected = 31_415_926_535d;
        double result = calc.multiple(3.1415926535d, 10_000_000_000d);
        assertThat(result, closeTo(expected, delta2));
    }
}