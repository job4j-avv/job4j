package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ItemTestSort1 {

    @Test
    public void compareTo() {
        Item item1 = new Item("4", "abcdef", "desc1", 4L);
        Item item2 = new Item("7", "edmne", "desc1", 7L);
        Item item3 = new Item("1", "shhsy", "desc1", 1L);
        Item item4 = new Item("25", "xdhaanb", "desc1", 25L);
        Item item5 = new Item("0", "abrtty", "desc1", 0L);
        List<Item> list = Arrays.asList(item1, item2, item3, item4, item5);
        List<Item> listSorted = Arrays.asList(item5, item3, item1, item2, item4);
        Collections.sort(list);
        Assert.assertThat(list, is(listSorted));
    }
}