package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test1", "test1Description", System.currentTimeMillis()));
        Item item2 = tracker.add(new Item("test2", "test2Description", System.currentTimeMillis()));
        tracker.add(item2);
        Item result = tracker.findById(item1.getId());
        assertThat(result.getName(), is(item1.getName()));
    }

    @Test
    public void whenAddNewItemThenTrackerHasNotSameItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test1", "test1Description", System.currentTimeMillis()));
        tracker.add(item1);
        Item item2 = tracker.add(new Item("test2", "test2Description", System.currentTimeMillis()));
        tracker.add(item2);
        Item result = tracker.findById(item2.getId());
        assertNotSame(result.getName(), is(item1.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        Item previous = tracker.add(new Item("test1", "test1Description", System.currentTimeMillis()));
        // Создаем новую заявку.
        Item next = tracker.add(new Item("test2", "testDescription2", System.currentTimeMillis()));
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        assertTrue(tracker.replace(previous.getId(), next));
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void delete() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test1", "testDescription1", System.currentTimeMillis()));
        Item item2 = tracker.add(new Item("test2", "testDescription2", System.currentTimeMillis()));
        Item item3 = tracker.add(new Item("test3", "testDescription3", System.currentTimeMillis()));
        assertTrue(tracker.delete(item3.getId()));
        Tracker tracker2 = new Tracker();
        tracker2.add(item1);
        tracker2.add(item2);
        assertThat(tracker.findAll(), is(tracker2.findAll()));
//        assertArrayEquals((ArrayList<Integer>)tracker.findAll(), (ArrayList<Integer>)tracker2.findAll());
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test1", "testDescription1", System.currentTimeMillis()));
        Item item2 = tracker.add(new Item("test2", "testDescription2", System.currentTimeMillis()));
        ArrayList<Item> result = (ArrayList<Item>) tracker.findAll();
        ArrayList<Item> test = new ArrayList<>();
        test.add(item1);
        test.add(item2);
        assertThat(result, is(test));
//        assertArrayEquals(result, test);
    }

    @Test
    public void findByNameTest() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test1", "testDescription1", System.currentTimeMillis()));
        Item item2 = tracker.add(new Item("test2", "testDescription2", System.currentTimeMillis()));
        Item item3 = tracker.add(new Item("test3", "testDescription3", System.currentTimeMillis()));
        ArrayList<Item> result = (ArrayList<Item>) tracker.findByName("test2");
        ArrayList<Item> test = new ArrayList<>();
        test.add(item2);
        assertThat(result, is(test));
    }
}