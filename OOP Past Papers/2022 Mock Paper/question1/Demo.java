package question1;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {

        Stack<String> theStack = new Stack<>();
        PrintReverse ob = new PrintReverse();
        ob.inputSentence(theStack);
        ob.printDentence(theStack);

    }
}
