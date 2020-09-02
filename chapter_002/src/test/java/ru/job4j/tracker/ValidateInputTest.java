package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.tracker.menu.MenuTracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * тест валидатора
 *
 * @author Arykin Valera
 */
public class ValidateInputTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    @Test
    public void whenInvalidInput() {
        Tracker tracker = new Tracker();
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"invalid", "6", "y"})
        );
        MenuTracker menu = new MenuTracker(input, tracker);
        ArrayList<Integer> range = new ArrayList<>();
        StartUI ui = new StartUI(input, tracker);
        menu.addActions(ui);
        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            range.add(i);
        }
        input.ask("select:", range);
        assertThat(
                this.mem.toString(),
                is(
                        "Введите коректные данные\n"
                )
        );
    }

    @Test
    public void whenInvalidInputLessZero() {
        Tracker tracker = new Tracker();
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"-500", "6", "y"})
        );
        MenuTracker menu = new MenuTracker(input, tracker);
        ArrayList<Integer> range = new ArrayList<>();
        StartUI ui = new StartUI(input, tracker);
        menu.addActions(ui);
        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            range.add(i);
        }
        input.ask("select:", range);
        assertThat(
                this.mem.toString(),
                is(
                        "Введите коректные данные\n"
                )
        );
    }
}
