package ru.job4j.tracker.menu;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;

public interface UserAction {

    /**
     * Константа меню для добавления новой заявки.
     */
    int ADD = 0;
    /**
     * Константа меню для показать все заявки.
     */
    int SHOW = 1;
    /**
     * Константа меню для редактирование заявки.
     */
    int EDIT = 2;
    /**
     * Константа меню для удаления заявки.
     */
    int DELETE = 3;
    /**
     * Константа меню для поиска заявки по Id.
     */
    int FINDID = 4;
    /**
     * Константа меню для поиска заявки по Имени.
     */
    int FINDNAME = 5;
    /**
     * Константа для выхода из цикла.
     */
    int EXIT = 6;


    /**
     * Метод возвращает ключ опции.
     * @return ключ
     */
    int key();

    /**
     * Основной метод.
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    void execute(Input input, Tracker tracker);

    /**
     * Метод возвращает информацию о данном пункте меню.
     * @return Строка меню
     */
    String info();
}
