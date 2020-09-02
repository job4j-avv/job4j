package ru.job4j.tracker.menu;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import java.util.ArrayList;

/**
 * Реализует действие Поиск заявки по имени
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class FindItemsByName extends BaseAction {

    /**
     * Конструктор.
     *
     * @param key ключ операции
     * @param name текст строки меню
     */
    public FindItemsByName(int key, String name) {
        super(key, name);
    }

    /**
     * Метод выполняет действие - Поиск заявки по имени
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск заявки(-oк) --------------");
        String name = input.ask("Скопируйте и введите имя заявки: ");
        ArrayList<Item> items = (ArrayList<Item>) tracker.findByName(name);
        if (items != null && items.size() != 0) {
            System.out.println("Найденно заявок: " + items.size());
            System.out.println("--------------------------------------");
            int i = 0;
            for (Item item : items) {
                System.out.println(++i + ")  Имя: " + item.getName());
                System.out.println("    Описание: " + item.getDesc());
                System.out.println("    ID: " + item.getId());
            }
        } else {
            System.out.println("не получилось найти ни одну заявку с таким именем!");
        }
    }
}
