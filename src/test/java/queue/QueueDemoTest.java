package queue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.Assert.*;

public class QueueDemoTest {
    public List<String> listStringDemo(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add("String " + i);
        }

        return list;
    }

    public Queue<String> queueStringDemo(int n) {
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add("String " + i);
        }

        return queue;
    }

    @Test
    public void testAddQueueDemo() {
        QueueDemo queue = new QueueDemo();

        String result = queue.addQueueDemo(listStringDemo(3));
        String resultFull = queue.addQueueDemo(listStringDemo(4));

        assertEquals("Queue size: 3", result);
        assertEquals("Queue is full", resultFull);
    }

    @Test
    public void testOfferQueueDemo() {
        QueueDemo queue = new QueueDemo();

        Boolean result = queue.offerQueueDemo(listStringDemo(3));
        Boolean resultFull = queue.offerQueueDemo(listStringDemo(4));

        assertTrue(result);
        assertFalse(resultFull);
    }

    @Test
    public void testElementQueueDemo() {
        QueueDemo queue = new QueueDemo();

        String result = queue.elementQueueDemo(queueStringDemo(3));
        String resultNull = queue.elementQueueDemo(queueStringDemo(0));

        assertEquals("String 0", result);
        assertEquals("Queue is null", resultNull);
    }

    @Test
    public void testPeekQueueDemo() {
        QueueDemo queue = new QueueDemo();

        String result = queue.peekQueueDemo(queueStringDemo(3));
        String resultFull = queue.peekQueueDemo(queueStringDemo(0));

        assertEquals("String 0 : 3", result);

        assertEquals("null : 0", resultFull);
    }

    @Test
    public void testRemoveQueueDemo() {
        QueueDemo queue = new QueueDemo();

        String result = queue.removeQueueDemo(queueStringDemo(3));
        String resultNull = queue.removeQueueDemo(queueStringDemo(0));

        assertEquals("String 0 : 2", result);
        assertEquals("Queue is null", resultNull);
    }

    @Test
    public void testPollQueueDemo() {
        QueueDemo queue = new QueueDemo();

        String result = queue.pollQueueDemo(queueStringDemo(3));
        String resultFull = queue.pollQueueDemo(queueStringDemo(0));

        assertEquals("String 0 : 2", result);

        assertEquals("null : 0", resultFull);
    }
}