package ru.job4j.tracker.menu;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.StartUI;
import ru.job4j.tracker.Tracker;

/**
 * Действия Выход из программы (не реализован)
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class ExitProgram extends BaseAction {

    private final StartUI ui;

    /**
     * Конструктор.
     *
     * @param key ключ операции
     * @param name текст строки меню
     */
    public ExitProgram(final StartUI ui, int key, String name) {
        super(key, name);
        this.ui = ui;
    }

    /**
     * Метод не реализован
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    @Override
    public void execute(Input input, Tracker tracker) {
       if ("y".equals(input.ask("Exit? (y): "))) {
           ui.stop();
       }
    }

}
