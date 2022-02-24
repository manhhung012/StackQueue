package queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public String addQueueDemo(List<String> listStringDemo) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        try {
            for (String string : listStringDemo) {
                queue.add(string);
            }
        } catch (Exception e) {
            return "Queue is full";
        }

        return "Queue size: " + queue.size();
    }

    public boolean offerQueueDemo(List<String> listStringDemo) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        for (String string : listStringDemo) {
            boolean check = queue.offer(string);
            if (!check) {
                return check;
            }
        }
        return true;
    }

    public String elementQueueDemo(Queue<String> queueStringDemo) {
        try {
            return queueStringDemo.element();
        } catch (Exception e) {
            return "Queue is null";
        }
    }

    public String peekQueueDemo(Queue<String> queueStringDemo) {
        return queueStringDemo.peek() + " : " + queueStringDemo.size();
    }

    public String removeQueueDemo(Queue<String> queueStringDemo) {
        try {
            return queueStringDemo.remove() + " : " + queueStringDemo.size();
        } catch (Exception e) {
            return "Queue is null";
        }
    }

    public String pollQueueDemo(Queue<String> queueStringDemo) {
        return queueStringDemo.poll() + " : " + queueStringDemo.size();
    }
}
