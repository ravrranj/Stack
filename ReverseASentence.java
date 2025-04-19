
import java.util.Stack;
import java.util.Scanner;;

public class ReverseASentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words
        String[] words = sentence.trim().split("\\s+");

        Stack<String> stack = new Stack<>();

        // Push all words onto the stack
        for (String word : words) {
            stack.push(word);
        }

        // pop words to print in reverse
        System.out.print("Reversed sentence: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
