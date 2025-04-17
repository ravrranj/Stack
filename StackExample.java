

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10); // [10]
        stack.push(20); // [10, 20]
        stack.push(30); // [10, 20, 30] 

        System.out.println("Top element: " + stack.peek()); //30

        stack.pop();  //removes 30 -> [10, 20]
        System.out.println("After pop, top: " + stack.peek()); //20

        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}