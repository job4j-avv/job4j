package ru.job4j.tracker.menu;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;

/**
 * Реализует действия Удаление заявки
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class DeleteItem extends BaseAction {

    /**
     * Конструктор.
     *
     * @param key ключ операции
     * @param name текст строки меню
     */
    public DeleteItem(int key, String name) {
        super(key, name);
    }

    /**
     * Метод выполняет действие - Удаление заявки
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Удаление заявки --------------");
        String id = input.ask("Скопируйте и введите id заявки: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка " + id + " удалена!");
        } else {
            System.out.println("не получилось удалить заявку!");
        }
    }

}