package ru.job4j.tracker.menu;

public abstract class BaseAction implements UserAction {

    private final int key;
    private final String name;

    /**
     * Дефолтный Конструктор.
     *
     * @param key ключ операции
     * @param name текст строки меню
     */
    protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }

    /**
     * возвращает ключ операции
     * @return int ключ
     */
    @Override
    public int key() {
        return this.key;
    }

    /**
     * Возвращает инофрмацию о пункте меню
     * @return String строка меню
     */
    @Override
    public String info() {
        return String.format("%s. %s", this.key, this.name);
    }
}
