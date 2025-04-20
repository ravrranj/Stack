
import java.util.*;

public class RemoveDuplicates {

    static String removeDuplicates(String str) {
        Stack<Character> stack = new Stack<>();
        HashSet<Character> seen = new HashSet<>();
        return removeRecursive(str.toCharArray(), 0, stack, seen);
    }

    static String removeRecursive(char[] arr, int index, Stack<Character> stack, HashSet<Character> seen) {

        if (index == arr.length) {

            // Build result from stack
            StringBuilder result = new StringBuilder();
            for (char c : stack) {
                result.append(c);
            }

            return result.toString();
        }

        char currentChar = arr[index];
        char lowerChar = Character.toLowerCase(currentChar);

        if (!seen.contains(lowerChar)) {
            seen.add(lowerChar);
            stack.push(currentChar);
        }

        return removeRecursive(arr, index + 1, stack, seen);
    }

    public static void main(String[] args) {
        String input = "AAaBbBccCC";
        System.out.println("Result: " + removeDuplicates(input));
    }
}