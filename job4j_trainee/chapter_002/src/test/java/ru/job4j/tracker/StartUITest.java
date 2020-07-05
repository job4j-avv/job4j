package ru.job4j.tracker;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void addAndExit() {
        StubInput input = new StubInput(new String[]{"0", "Name 1", "Desc 1", "1", "6", "y"});
        Tracker tracker = new Tracker();
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getName(), is("Name 1"));
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", System.currentTimeMillis()));
        Input input = new StubInput(new String[]{"2", item.getId(), "1", "test replace", "1", "заменили заявку", "3", "1", "6", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("заменили заявку"));
    }

    @Test
    public void whenDeleteValue() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("name 1", "desc 1", System.currentTimeMillis()));
        Item item2 = tracker.add(new Item("name 2", "desc 2", System.currentTimeMillis()));
        Input input = new StubInput(new String[]{"3", item2.getId(), "6", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item1.getId()).getName(), is("name 1"));
        assertThat(tracker.findById(item2.getId()), Matchers.nullValue());
    }


    public final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void beforeTest() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void afterTest() {
        System.setOut(stdout);
    }

    @Test
    public void addAndShowAll() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("name 1", "desc 1", System.currentTimeMillis()));
        Item item2 = tracker.add(new Item("name 2", "desc 2", System.currentTimeMillis()));
        StubInput input = new StubInput(new String[]{"1", "6", "y"});
        StartUI ui = new StartUI(input, tracker);
        ui.init();
        StringBuilder expected = new StringBuilder()
                .append("0. Новая заявка\n1. Показать все заявки\n2. Редактирование заявки\n3. Удаление заявки\n4. Поиск заявки по Id\n5. Поиск заявки по Имени\n6. Выход\n------------ Список всех заявок --------------\n1)  Заявка: name 1  описание: desc 1  id: " + item1.getId() + "\n2)  Заявка: name 2  описание: desc 2  id: " + item2.getId() + "\n------------ Конец списка --------------\n0. Новая заявка\n1. Показать все заявки\n2. Редактирование заявки\n3. Удаление заявки\n4. Поиск заявки по Id\n5. Поиск заявки по Имени\n6. Выход\n");
        assertThat(new String(out.toByteArray()), is(expected.toString()));
    }
}