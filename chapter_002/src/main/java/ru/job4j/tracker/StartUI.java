package ru.job4j.tracker;

import ru.job4j.tracker.menu.*;

import java.util.ArrayList;

/**
 * Трекер заявок.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class StartUI {

    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Получение данных от пользователя.
     */
    private boolean exit = false;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        ArrayList<Integer> range = new ArrayList();
        menu.addActions(this);
        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            range.add(i);
        }
        do {
            menu.show();
            menu.select(input.ask("select:", range));
        } while (!this.exit);
    }

    /**
     * Останавливает работу программы
     *
     */
    public void stop() {
        this.exit = true;
    }

    /**
     * Запускт программы.
     *
     * @param args не используются
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
        System.out.println("Завершение работы программы.");
    }
}
