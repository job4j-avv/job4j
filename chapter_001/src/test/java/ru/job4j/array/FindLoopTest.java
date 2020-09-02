package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void indexOf9at3() {
        int[] data = new int[]{4, 0, 7, 9, 3};
        FindLoop fl = new FindLoop();
        int result = fl.indexOf(data, 9);
        assertThat(result, is(3));
    }

    @Test
    public void indexOf4at0() {
        int[] data = new int[]{4, 0, 7, 9, 3};
        FindLoop fl = new FindLoop();
        int result = fl.indexOf(data, 4);
        assertThat(result, is(0));
    }

    @Test
    public void indexOfWrong() {
        int[] data = new int[]{4, 0, 7, 9, 3};
        FindLoop fl = new FindLoop();
        int result = fl.indexOf(data, 100);
        assertThat(result, is(-1));
    }
}