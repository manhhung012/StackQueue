package queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public String addArrayDequeDemo(String a, String b, String c, String d) {
        String string = "";
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(a);
        arrayDeque.addFirst(b);
        arrayDeque.addLast(c);
        arrayDeque.add(d);

        int n = arrayDeque.size();

        string = arrayDeque.toString();

        return string;
    }

    public String elementArrayDequeDemo(ArrayDeque<String> arrayDeque) {
        String string = "";
        try {
            string = arrayDeque.element();
        } catch (Exception e) {
            string = "Ex null";
        }
        return string;
    }

    public String peekArrayDequeDemo(ArrayDeque<String> arrayDeque) {
        String string = arrayDeque.peek();
        if (string != null) {
            string += arrayDeque.peekFirst();
            string += arrayDeque.peekLast();
        }
        return string;
    }

    public String removeArrayDequeDemo(ArrayDeque<String> arrayDeque) {
        String string = "";
        try {
            string += arrayDeque.remove();
            string += arrayDeque.removeFirst();
            string += arrayDeque.removeLast();
            string += " : " + arrayDeque.size();
        } catch (Exception e) {
            string = "Ex null";
        }
        return string;
    }

    public String pollArrayDequeDemo(ArrayDeque<String> arrayDeque) {
        String string = arrayDeque.poll();
        if (string != null) {
            string += arrayDeque.pollFirst();
            string += arrayDeque.pollLast();
        }
        return string + " : " + arrayDeque.size();
    }
}
