package ru.job4j.tracker.menu;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import java.util.List;

/**
 * Реализует действие Показать все заявки
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class ShowItems extends BaseAction {

    /**
     * Конструктор.
     *
     * @param key ключ операции
     * @param name текст строки меню
     */
    public ShowItems(int key, String name) {
        super(key, name);
    }

    /**
     * Метод выполняет действие - Показать все заявки
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Список всех заявок --------------");
        List<Item> items = tracker.findAll();
        int i = 1;
        for (Item item : items) {
            System.out.println(i++ + ")  Заявка: " + item.getName() + "  описание: " + item.getDesc() + "  id: " + item.getId());
        }
        System.out.println("------------ Конец списка --------------");
    }
}
