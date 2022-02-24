package stack;

import java.util.Stack;

public class StackDemo {
    public String pushStackDemo(Stack<String> stack) {
        stack.push("A");
        stack.push("B");
        stack.push("C");

        return stack.toString();
    }

    public String popStackDemo(Stack<String> stack) {
        String string = new String();

        int n = stack.size();
        for (int i = 0; i < n; i++) {
            string += stack.pop() + "/ ";
        }

        return string;
    }
}
