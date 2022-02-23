package queue;

import model.User;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        //Create PriorityQueue demo
        Queue<String> priorityQueueStrings = new PriorityQueue<>();
        Queue<Integer> priorityQueueInteger = new PriorityQueue<>();
        Queue<User> priorityQueueUser = new PriorityQueue<>();


        //add with String
        priorityQueueStrings.add("G");
        priorityQueueStrings.add("A");
        priorityQueueStrings.add("V");
        priorityQueueStrings.add("B");
        priorityQueueStrings.add("W");

        //poll with string
        while (true) {
            String string = priorityQueueStrings.poll();
            if (string == null) {
                break;
            }
            System.out.print("String = " + string + "\t");
        }

        System.out.println("\n");

        //add with Integer
        priorityQueueInteger.add(6);
        priorityQueueInteger.add(4);
        priorityQueueInteger.add(1);
        priorityQueueInteger.add(9);
        priorityQueueInteger.add(7);
        priorityQueueInteger.add(8);

        //pop with Integer
        while (true) {
            Integer integer = priorityQueueInteger.poll();
            if (integer == null) {
                break;
            }
            System.out.print("Integer = " + integer + "\t");
        }

        //add with object user
        System.out.println("\n");

        priorityQueueUser.offer(new User(78, "Hung", 23));
        priorityQueueUser.offer(new User(14, "Trien", 22));
        priorityQueueUser.offer(new User(63, "Luc", 20));
        priorityQueueUser.offer(new User(6, "Hai", 23));
        priorityQueueUser.offer(new User(152, "Anh", 23));

        //pop with name of user
        while (true) {
            User u = priorityQueueUser.poll();
            if (u == null) {
                break;
            }
            System.out.println("Integer = " + u);
        }
    }
}
