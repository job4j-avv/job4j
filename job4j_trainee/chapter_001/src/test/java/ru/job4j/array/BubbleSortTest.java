package ru.job4j.array;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        int[] arr = {5, 1, 2, 7, 13, 1, 9, 53};
        BubbleSort bs = new BubbleSort();
        int[] result = bs.sort(arr);
        int[] exp = {1, 1, 2, 5, 7, 9, 13, 53};
        assertThat(result, Matchers.is(exp));
    }
}