package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.sort.ItemComparatorByAscendingOrder;
import ru.job4j.tracker.sort.ItemComparatorByDescendingOrder;

import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ItemTestSort {

    /**
     * Тест на встроенную сортировку List
     */
    @Test
    public void listSort() {
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

    /**
     * Тест через интерфейс Comparable объекта Item
     */
    @Test
    public void listSort2() {
        Item item1 = new Item("4", "abcdef", "desc1", 4L);
        Item item2 = new Item("7", "edmne", "desc1", 7L);
        Item item3 = new Item("1", "shhsy", "desc1", 1L);
        Item item4 = new Item("25", "xdhaanb", "desc1", 25L);
        Item item5 = new Item("0", "abrtty", "desc1", 0L);
        Item[] arrayItem = new Item[]{item1, item2, item3, item4, item5};
        Item[] arraySorted = new Item[]{item5, item3, item1, item2, item4};
        Arrays.sort(arrayItem);
        Assert.assertThat(arrayItem, is(arraySorted));
    }

    /**
     * Тест через интерфейс Comparator - по возрастанию.
     */
    @Test
    public void listSort3() {
        Item item1 = new Item("4", "abcdef", "desc1", 4L);
        Item item2 = new Item("7", "edmne", "desc1", 7L);
        Item item3 = new Item("1", "shhsy", "desc1", 1L);
        Item item4 = new Item("25", "xdhaanb", "desc1", 25L);
        Item item5 = new Item("0", "abrtty", "desc1", 0L);
        Item[] arrayItem = new Item[]{item1, item2, item3, item4, item5};
        Item[] arraySorted = new Item[]{item5, item3, item1, item2, item4};
        Arrays.sort(arrayItem, new ItemComparatorByAscendingOrder());
        for (Item it : arrayItem) {
            System.out.println(it.getId());
        }
        Assert.assertThat(arrayItem, is(arraySorted));
    }

    /**
     * Тест через интерфейс Comparator - по убыванию.
     */
    @Test
    public void listSort4() {
        Item item1 = new Item("4", "abcdef", "desc1", 4L);
        Item item2 = new Item("7", "edmne", "desc1", 7L);
        Item item3 = new Item("1", "shhsy", "desc1", 1L);
        Item item4 = new Item("25", "xdhaanb", "desc1", 25L);
        Item item5 = new Item("0", "abrtty", "desc1", 0L);
        List<Item> arrayItem = Arrays.asList(item1, item2, item3, item4, item5);
        List<Item> arraySorted = Arrays.asList(item4, item2, item1, item3, item5);
        Collections.sort(arrayItem, new ItemComparatorByDescendingOrder());
        for (Item it : arrayItem) {
            System.out.println(it.getId());
        }
        Assert.assertThat(arrayItem, is(arraySorted));
    }
}