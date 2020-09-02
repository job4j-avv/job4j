package ru.job4j.tracker.sort;

import ru.job4j.tracker.Item;

import java.util.Comparator;

/**
 * Компаратор для сортировки по убыванию(Descending).
 */
public class ItemComparatorByDescendingOrder implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        return Integer.valueOf(item2.getId()).compareTo(Integer.valueOf(item1.getId()));
    }
}