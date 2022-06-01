package question1;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class PrintReverse {

    Scanner sc = new Scanner(System.in);

    public void inputSentence(Stack<String> theStack) {

        String word;

        System.out.print("Enter the first word in your Sentence : ");
        word = sc.next();

        while(!word.endsWith(".")){
            theStack.push(word);

            System.out.print("Enter a word by word : ");
            word = sc.next();
        }

        theStack.push(word);

    }

    public void printDentence(Stack<String> theStack) {
        ListIterator<String> list = theStack.listIterator(theStack.size());

        System.out.println("Reverse Sentence :");

        while (list.hasPrevious()){
            String words = list.previous();
            System.out.println(words);
        }
    }
}
