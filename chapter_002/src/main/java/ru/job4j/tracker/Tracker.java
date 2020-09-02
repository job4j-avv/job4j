package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Треккер заявок.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Tracker {

    /**
     * Массив для хранение заявок.
     */
    private List<Item> items = new ArrayList<>();

    /**
     * Добавление заявок.
     *
     * @param item новая заявка
     * @return Item добавленая заявка
     */
    public Item add(Item item) {
        if (item != null) {
            item.setId(this.generateId(item.getTime()));
            this.items.add(item);
        }
        return item;
    }

    /**
     * редактирование заявок
     *
     * @param id   строка id заявки
     * @param item новая заявка
     * @return boolean удалось или нет изменить заявку
     */
    public boolean replace(String id, Item item) {
        if (id == null || id.isEmpty()) {
            return false;
        }
        int index = indexOf(id);
        boolean result = index >= 0;
        if (result) {
            this.items.set(index, item);
        }
        return result;
    }

    /**
     * удаление заявок
     *
     * @param id строка id заявки
     * @return boolean удалось или нет удалить заявку
     */
    public boolean delete(String id) {
        if (id == null || id.isEmpty()) {
            return false;
        }
        boolean result = false;
        int i = this.indexOf(id);
        if (i >= 0) {
            this.items.remove(i);
            result = true;
        }
        return result;
    }

    /**
     * получение списка всех заявок
     *
     * @return Item[] массив заявок
     */
    public List<Item> findAll() {
        return this.items;
    }

    /**
     * получение списка по имени
     *
     * @param key строка ключ заявки
     * @return Item[] массив заявок
     */
    public List<Item> findByName(String key) {
        if (key == null || key.isEmpty()) {
            return null;
        }
        List<Item> result = new ArrayList<>();
        for (Item i : this.items) {
            if (i.getName().equals(key)) {
                result.add(i);
            }
        }
        return result;
    }

    /**
     * получение заявки по id
     *
     * @param id строка id заявки
     * @return Item найденная заявка
     */
    public Item findById(String id) {
        if (id == null || id.isEmpty()) {
            return null;
        }
        int i = this.indexOf(id);
        return i >= 0 ? this.items.get(i) : null;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Ключ состоит из двух частей, разделенных знаком "-":
     * - случайное положительное число типа Long
     * - число Long - время в милисекундах
     *
     * @return Уникальный ключ.
     */
    private String generateId(Long time) {
        if (time == null) {
            time = System.currentTimeMillis();
        }
        return Math.abs(new Random().nextLong()) + "-" + time;
    }

    /**
     * Возвращает индекс элемента в массиве по его id.
     *
     * @param id ключ искомого элемента.
     * @return int индекс в массиве.
     */
    private int indexOf(String id) {
        for (int j = 0; j < this.items.size(); j++) {
            if (this.items.get(j).getId().equals(id)) {
                return j;
            }
        }
        return -1;
    }
}
