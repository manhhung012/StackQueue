package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        //create ArrayDeque demo
        ArrayDeque<String> arrayDequeString = new ArrayDeque<>();

        //add
        arrayDequeString.add("string 1");
        arrayDequeString.addFirst("string 2");
        arrayDequeString.addLast("string 3");

        System.out.println(arrayDequeString);

        //offer
        arrayDequeString.offer("string 4");
        arrayDequeString.offerFirst("string 5");
        arrayDequeString.addLast("string 6");

        System.out.println(arrayDequeString);

        //element()
        String stringElement = arrayDequeString.element();
        System.out.println(stringElement);

        //peek()
        String stringPeek = arrayDequeString.peek();
        System.out.println(stringPeek);

        String stringPeekFirst = arrayDequeString.peekFirst();
        System.out.println(stringPeekFirst);

        String stringPeekLast = arrayDequeString.peekLast();
        System.out.println(stringPeekLast);

        System.out.println(arrayDequeString);// ArrayDeque no change

        //poll()
        String stringPoll = arrayDequeString.poll(); //Remote Element First in ArrayDeque (string 5)
        System.out.println(stringPoll);
        System.out.println(arrayDequeString);

        String stringPollFirst = arrayDequeString.pollFirst(); //Remote Element First in ArrayDeque (string 2)
        System.out.println(stringPollFirst);
        System.out.println(arrayDequeString);

        String stringPollLast = arrayDequeString.pollLast();
        System.out.println(stringPollLast);
        System.out.println(arrayDequeString);

        //clear
        arrayDequeString.clear();//Remove all elememt
        System.out.println(arrayDequeString);
    }

}
