package ru.job4j.tracker;

/**
 * Вариант синглтона - создается при загрузке класса. Eager loading
 */
public class TrackerSingle3 extends Tracker {

    private static final TrackerSingle3 INSTANCE = new TrackerSingle3();

    public static TrackerSingle3 getINSTANCE() {
        return INSTANCE;
    }
}
