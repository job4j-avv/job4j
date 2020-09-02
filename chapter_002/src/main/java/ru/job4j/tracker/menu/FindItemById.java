package ru.job4j.tracker.menu;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

/**
 * Реализует действие Поиск заявки по id
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class FindItemById extends BaseAction {

    /**
     * Конструктор.
     *
     * @param key ключ операции
     * @param name текст строки меню
     */
    public FindItemById(int key, String name) {
        super(key, name);
    }

    /**
     * Метод выполняет действие - Поиск заявки по id
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск заявки --------------");
        String id = input.ask("Скопируйте и введите id заявки: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Заявка найдена:");
            System.out.println("id: " + item.getId());
            System.out.println("Имя: " + item.getName());
            System.out.println("Описание: " + item.getDesc());
            System.out.println("--------------------------------------");
        } else {
            System.out.println("не получилось найти заявку!");
            System.out.println("--------------------------------------");
        }
    }
}
