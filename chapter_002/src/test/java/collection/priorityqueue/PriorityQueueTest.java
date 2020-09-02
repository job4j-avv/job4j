package collection.priorityqueue;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PriorityQueueTest {

    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("first_urgent", 1));
        queue.put(new Task("middle", 3));
        queue.put(new Task("last_urgent", 1));
        Task result = queue.take();
        assertThat(result.getDesc(), is("first_urgent"));
        /*
       выхлоп :
         1   first_urgent
         1   last_urgent
         3   middle
         5   low
        * */
    }
}