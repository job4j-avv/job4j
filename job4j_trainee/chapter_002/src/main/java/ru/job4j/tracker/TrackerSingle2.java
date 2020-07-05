package ru.job4j.tracker;

/**
 * Вариант синглтона - создается один раз при первом обращении. Lazy loading
 */
public class TrackerSingle2 extends Tracker {

    private volatile static TrackerSingle2 instance;

    public static TrackerSingle2 getINSTANCE() {
        if (instance == null) {
            synchronized (TrackerSingle2.class) {
                if (instance == null) {
                    instance = new TrackerSingle2();
                }
            }
        }
        return instance;
    }
}
