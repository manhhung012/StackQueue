package stack;

import model.User;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        //create stack demo
        Stack<String> stackString = new Stack<>();
        Stack<User> stackUser = new Stack<>();

        stackString.push("string 1");
        stackString.push("String 2");
        stackString.push("string 3");

        stackUser.push(new User(123,"Hung",19));
        stackUser.push(new User(3,"Hung",19));
        stackUser.push(new User(198,"Hung",19));
        stackUser.push(new User(147,"Hung",19));
        stackUser.push(new User(369,"Hung",19));

        int n = stackString.size(); //size stackString
        int m = stackUser.size(); //size stackUser

        //peek
        System.out.println("Peek: " + stackString.peek());
        System.out.println("After: " + stackString);

        //pop
        System.out.println("Pop() demo:");
        for (int i = 0; i < n; i++) {
            String string = stackString.pop();
            System.out.print("Turn " + (i + 1) + ": " + string);
            System.out.println(". Size: "+ stackString.size());
        }

        //empty
        System.out.println("stackString is empty? : "+ stackString.empty());

        for (int i =0; i<m;i++){
            System.out.println(stackUser.pop());
        }
    }
}
