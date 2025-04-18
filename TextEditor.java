
import java.util.Stack;

public class TextEditor {
    Stack<Character> textStack = new Stack<>();

    //Typing a character
    public void type(char c) {
        textStack.push(c);
    }

    // Undoing the last typed character

    public void undo() {
        if (!textStack.isEmpty()) {
            textStack.pop();
        }
    }

    // Getting current text
    public String getText() {
        StringBuilder sb = new StringBuilder();
        for (char c : textStack) {
            sb.append(c);
        }
        return sb.toString();
    }

    //Text the simulation

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.type('H');
        editor.type('e');
        editor.type('l');
        editor.type('l');
        editor.type('o');
        System.out.println("Text: " + editor.getText()); //Hello

        editor.undo(); //Removes 'o'
        System.out.println("After Undo: " + editor.getText());  //Hell

        editor.type('0');
        System.out.println("Final Text: " + editor.getText());  //Hell0
    }
}