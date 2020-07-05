package ru.job4j.tracker;

/**
 * Вариант синглтона - через  поле внутреннего класса. Lazy loading
 */
public class TrackerSingle4 extends Tracker {

    private static final class Holder {
        private static final TrackerSingle4 INSTANCE = new TrackerSingle4();
    }

    public static TrackerSingle4 getINSTANCE() {
        return Holder.INSTANCE;
    }
}
