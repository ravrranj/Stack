

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base word: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        //Push characters to stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder password = new StringBuilder();

        //Pop to reverse and build password

        while (!stack.isEmpty()) {
            password.append(stack.pop());
        }

        //Add random symbols and numbers
        String symbols = "@#%&*!";
        Random rand = new Random();
        for(int i = 0; i < 3; i++) {
            password.append(rand.nextInt(10));  // add random digits
            password.append(symbols.charAt(rand.nextInt(symbols.length()))) ; // random symbol
        }

        System.out.println("Generated Password : " + password.toString());
    }
}