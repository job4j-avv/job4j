package collection.priorityqueue;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * <p/>
     * Если приоритеты совпалают, тогда наиболее старый будет первым.
     * Если нужно чтобы было наоборот - поставь условие <= в операторе сравнения.
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (task.getPriority() < element.getPriority()) {
                break;
            } else {
                ++index;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
//        for (Task element : tasks) {
//            System.out.println(element.getPriority() + "   " + element.getDesc());
//        }
        return tasks.poll();
    }
}