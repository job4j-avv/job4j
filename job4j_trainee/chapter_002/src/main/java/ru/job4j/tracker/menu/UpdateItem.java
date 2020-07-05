package ru.job4j.tracker.menu;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

/**
 * Реализует действие Редактирование заявки
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class UpdateItem extends BaseAction {

    /**
     * Конструктор.
     *
     * @param key ключ операции
     * @param name текст строки меню
     */
    public UpdateItem(int key, String name) {
        super(key, name);
    }

    /**
     * Метод выполняет действие - Редактирование заявки
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Редактирование заявки --------------");
        String id = input.ask("Скопируйте и введите id заявки: ");
        Item item = tracker.findById(id);
        boolean exit = false;
        while (!exit) {
            System.out.println(" Выберите, что хотите изменить: ");
            System.out.println("    1. Имя заявки");
            System.out.println("    2. Описание заявки");
            System.out.println("    3. Закончить редактирование");
            String newName;
            String newDesc;
            String value = input.ask("ваш выбор: ");
            switch (Integer.parseInt(value)) {
                case 1: {
                    newName = input.ask("Введите новое имя заявки: ");
                    item.setName(newName);
                    break;
                }
                case 2: {
                    newDesc = input.ask("Введите новое описание заявки: ");
                    item.setDecs(newDesc);
                    break;
                }
                case 3: {
                    tracker.replace(id, item);
                    System.out.println("Заявка изменена. Новые данные: ");
                    System.out.println("Имя: " + item.getName());
                    System.out.println("Описание: " + item.getDesc());
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Неправильный пункт меню!");
                }
            }
        }
    }
}
