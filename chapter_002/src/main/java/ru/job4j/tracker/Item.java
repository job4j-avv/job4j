package ru.job4j.tracker;


import java.util.Objects;

/**
 * Описывает бизнес модель заявки.
 *
 * @author Valery Arykin (arykin.valera@gmail.com)
 * @version 0.0.1
 */
public class Item implements Comparable<Item> {

    private String id;
    private String name;
    private String desc;
    private long time;

    public Item(String name, String desc, long time) {
        this.name = name;
        this.desc = desc;
        this.time = time;
    }

    /*
     * Конструктор с параметром id
     */
    public Item(String id, String name, String desc, long time) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.time = time;
    }

    /**
     * Реализация  Comparable.
     * Сравнивает id приводя их в числовой вид.
     *
     * @param item сравниваемый Item
     * @return int число меньше нуля, ноль, больше нуля.
     */
    @Override
    public int compareTo(Item item) {
        return Integer.valueOf(this.getId()).compareTo(Integer.valueOf(item.getId()));
    }

    @Override
    public String toString() {
        return "id=" + this.id + "\n name=" + this.name + "\n desc=" + this.desc + "\n time=" + this.time + "\n";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDecs(String desc) {
        this.desc = desc;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(id, item.id) && time == item.time && Objects.equals(name, item.name) && Objects.equals(desc, item.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, desc, time);
    }
}