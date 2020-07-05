package ru.job4j.tracker.sort;

import ru.job4j.tracker.Item;

import java.util.Comparator;

public class ItemSorter implements Comparable<Item> {
    @Override
    public int compareTo(Item item) {
        return 0;
    }


//    @Override
//    public int compare(Item item1, Item item2) {
//        return item1.getId().compareTo(item2.getId());
//    }
}
