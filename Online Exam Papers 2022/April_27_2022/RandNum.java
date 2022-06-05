package April_27_2022;

public class RandNum {
    private int[][] array = new int[5][5];
    private int minimum = 9999,maximum = 0,tot = 0;
    private double avg = 0 ;

    public RandNum(){
        for(int i = 0 ; i < 5 ; ++i){
            for(int j = 0 ; j < 5 ; ++j){
                array[i][j] = (int)(Math.random()*99)+1;
            }
        }
    }

    public void calculate(){
        for(int i = 0 ; i < 5 ; ++i){
            for(int j = 0 ; j < 5 ; ++j){
                if(array[i][j] < minimum){
                    minimum = array[i][j];
                }
                if(array[i][j] > maximum){
                    maximum = array[i][j];
                }
                tot += array[i][j];
            }
        }
        avg = tot/25;
    }

    public void display(){
        for(int i = 0 ; i < 5 ; ++i){
            for(int j = 0 ; j < 5 ; ++j){
                System.out.print(array[i][j] + " ");
            }

            System.out.println("");
        }

        System.out.println("Minimum Number of the array is : " +minimum);
        System.out.println("Maximum Number of the array is : " +maximum);
        System.out.println("Average of the array is : " +avg);
    }


}
