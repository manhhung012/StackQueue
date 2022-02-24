package queue;

import model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PriorityQueueDemoTest {

    @Test
    public void testPollPriorityQueue() {
        PriorityQueueDemo priorityQueue = new PriorityQueueDemo();
        List<String> list = new ArrayList<>();
        list.add("W");
        list.add("A");
        list.add("G");
        list.add("C");
        list.add("B");
        list.add("S");
        list.add("K");

        String result = priorityQueue.pollPriorityQueue(list);

        assertEquals("ABCGKSW", result);
    }

    @Test
    public void testPollUserPriorityQueue() {
        PriorityQueueDemo priorityQueue = new PriorityQueueDemo();
        List<User> list = new ArrayList<>();
        list.add(new User(125, "Hung", 19));
        list.add(new User(63, "Trien", 19));
        list.add(new User(15, "Anh", 19));
        list.add(new User(68, "Luc", 19));

        String result = priorityQueue.pollUserPriorityQueue(list);

        assertEquals("Anh / Hung / Luc / Trien / ", result);
    }
}