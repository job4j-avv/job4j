package ru.job4j.tracker.menu;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.StartUI;
import ru.job4j.tracker.Tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализует меню
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class MenuTracker {

    /**
     * хранит ссылку на объект .
     */
    private Input input;

    /**
     * хранит ссылку на объект .
     */
    private Tracker tracker;

    /**
     * хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> actions = new ArrayList<>();

    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }

    /**
     * Метод заполняет меню.
     */
    public void addActions(final StartUI ui) {
        addAction(new AddItem(0, "Новая заявка") { });
        addAction(new ShowItems(1, "Показать все заявки") { });
        addAction(new UpdateItem(2, "Редактирование заявки") { });
        addAction(new DeleteItem(3, "Удаление заявки") { });
        addAction(new FindItemById(4, "Поиск заявки по Id") { });
        addAction(new FindItemsByName(5, "Поиск заявки по Имени") { });
        addAction(new ExitProgram(ui, 6, "Выход") { });
    }

    /**
     * Метод заполняет массив .
     */
    public void addAction(UserAction action) {
        this.actions.add(action);
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
}