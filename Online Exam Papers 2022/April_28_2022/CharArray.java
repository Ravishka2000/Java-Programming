package April_28_2022;

import java.util.Arrays;

public class CharArray {

    private char[] myCharArray;
    private int length;
    private char character;

    public CharArray(char[] myCharArray) {
        this.myCharArray = myCharArray;
    }

    public void swapFirstAndLast(){
        length = myCharArray.length;
        character = myCharArray[0];
        myCharArray[0] = myCharArray[length-1];
        myCharArray[length-1] = character;
    }

    public void displayArray(){
        System.out.println("Initial char Array : " + Arrays.toString(myCharArray));
    }

    public void displayString(){
        System.out.println("After Swapping the Array : " + String.valueOf(myCharArray));
    }
}
