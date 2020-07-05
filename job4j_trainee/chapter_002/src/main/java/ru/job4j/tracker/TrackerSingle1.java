package ru.job4j.tracker;

/**
 * Вариант синглтона - через перечисления/enum. Eager loading
 */
public enum TrackerSingle1 {

    INSTANCE;

    private Tracker tracker;

    TrackerSingle1() {
        tracker = new Tracker();
    }

    public Tracker getTracker() {
        return tracker;
    }
}
