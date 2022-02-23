package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Stack {
    public static void main(String[] args) {

        //create queue demo
        Queue<String> stringQueue = new LinkedList<>();
        Queue<String> stringQueueNull = new LinkedList<>();
        Queue<String> stringQueueLimit = new ArrayBlockingQueue<>(2);

        //add
        stringQueue.add("string 1");
        stringQueue.add("string 2");
        stringQueue.add("string 3");

        stringQueueLimit.add("string 1");
        stringQueueLimit.add("string 2");

        System.out.println(stringQueue);

        try {
            stringQueueLimit.add("String 3");
        } catch (Exception e) {
            System.out.println("Queue is full");
        }

        //offer
        stringQueue.offer("string 6");
        stringQueue.offer("string 7");
        stringQueue.offer("string 8");

        System.out.println(stringQueue);

        System.out.println(stringQueueLimit.offer("string 3")); //fales

        //element
        System.out.println(stringQueue.element());

        try {
            System.out.println(stringQueueNull.element()); //null
        } catch (Exception e) {
            System.out.println("Queue is null");
        }

        //peek
        System.out.println(stringQueue.peek());

        System.out.println(stringQueueNull.peek()); //null

        //remove
        System.out.println(stringQueue.remove());

        System.out.println(stringQueue);

        try {
            System.out.println(stringQueueNull.remove()); //null
        } catch (Exception e) {
            System.out.println("Queue is null");
        }

        //poll
        System.out.println(stringQueue.poll());

        System.out.println(stringQueue);

        System.out.println(stringQueueNull.poll()); //null

    }
}
