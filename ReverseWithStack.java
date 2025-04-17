
import java.util.Stack;


public class ReverseWithStack {
    public static void main(String[] args) {
        String input = "chunchun" ;
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reverse: " + reversed);
    }

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters to build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}