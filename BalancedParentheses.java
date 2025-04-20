
import java.util.*;

public class BalancedParentheses {

    static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            // IF OPENING, PUSH TO STACK

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            // if closing , check matching
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // Must be empty if fully matched
    }

    public static void main(String[] args) {
        String input = "([{}])";
        System.out.println("Is Balanced : " + isBalanced(input));
    }
}