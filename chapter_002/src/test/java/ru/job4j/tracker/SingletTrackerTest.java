package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;


/**
 * Тесты на объект синглтон, (проверяющие его синглетность).
 *
 *  * @author Valery Arykin (arykin.valera@gmail.com)
 *  * @version 0.0.1
 */
public class SingletTrackerTest {
    @Test
    public void test1() {
        Tracker t1 = TrackerSingle1.INSTANCE.getTracker();
        Tracker t2 = TrackerSingle1.INSTANCE.getTracker();
        assertThat(t1, is(t2));
    }

    @Test
    public void test2() {
        Tracker t1 = TrackerSingle2.getINSTANCE();
        Tracker t2 = TrackerSingle2.getINSTANCE();
        assertThat(t1, is(t2));
    }

    @Test
    public void test3() {
        Tracker t1 = TrackerSingle3.getINSTANCE();
        Tracker t2 = TrackerSingle3.getINSTANCE();
        assertThat(t1, is(t2));
    }

    @Test
    public void test4() {
        Tracker t1 = TrackerSingle4.getINSTANCE();
        Tracker t2 = TrackerSingle4.getINSTANCE();
        assertThat(t1, is(t2));
    }

    /**
     * Тест , что объекты разные.
     * */
    @Test
    public void test5() {
        Tracker t1 = TrackerSingle1.INSTANCE.getTracker();
        Tracker t2 = TrackerSingle4.getINSTANCE();
        assertThat(t1, not(t2));
    }
}