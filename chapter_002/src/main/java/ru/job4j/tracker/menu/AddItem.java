package ru.job4j.tracker.menu;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

/**
 * Реализует действия Добавление заявки
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class AddItem extends BaseAction {

    /**
     * Дефолтный Конструктор.
     *
     * @param key  ключ операции
     * @param name текст строки меню
     */
    protected AddItem(int key, String name) {
        super(key, name);
    }

    /**
     * Метод выполняет действие - Добавление заявки
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = input.ask("Введите имя заявки :");
        String desc = input.ask("Введите описание заявки :");
        long time = System.currentTimeMillis();
        Item item = new Item(name, desc, time);
        tracker.add(item);
        System.out.println("------------ Новая заявка с getId: (" + item.getId() + ") -----------");
    }

}
