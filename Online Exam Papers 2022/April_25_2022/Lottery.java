package April_25_2022;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    int[] lotteryNumbers = new int[5];
    int[] usersArray = new int[5];
    int[] matchingNums = new int[5];
    int k = 0;

    public Lottery() {
        for(int i = 0 ; i < 5 ; ++i){
            lotteryNumbers[i] = (int) (Math.random()*9);
        }
    }

    public void setUsersArray(int[] usersArray) {
        this.usersArray = usersArray;
    }

    public void compareNumbers() {
        for(int i = 0 ; i < 5 ; ++i){
            for(int j = 0 ; j < 5 ; ++j) {
                if (lotteryNumbers[i] == usersArray[j]) {
                    matchingNums[k] = usersArray[j];
                    k++;
                }
            }
        }

        System.out.println("Lottery Number Array : " + Arrays.toString(lotteryNumbers));
        System.out.println("User's Number Array : " + Arrays.toString(usersArray));
        System.out.println("\nMatching Numbers : " + Arrays.toString(matchingNums));

    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        int[] array = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 5 ; ++i){
            System.out.print("Enter your Lottery number " + (i+1) + " : ");
            array[i] = sc.nextInt();
        }

        lottery.setUsersArray(array);
        lottery.compareNumbers();
    }


}
