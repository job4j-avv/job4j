package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial f = new Factorial();
        long result = f.calc(5L);
        assertThat(result, is(120L));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial f = new Factorial();
        long result = f.calc(0L);
        assertThat(result, is(1L));
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        Factorial f = new Factorial();
        long result = f.calc(1L);
        assertThat(result, is(1L));
    }
}