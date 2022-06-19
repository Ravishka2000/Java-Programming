package Question3b;

import java.util.TreeSet;

public class AscendingList <T> {

    private TreeSet<T> sortedSet = new TreeSet<T>();

    public void add(T value){
        sortedSet.add(value);
    }

    public void displayMyList(AscendingList ascendingList){

        for(Object val : ascendingList.sortedSet) {
            System.out.println(val);
        }

        System.out.println("");
    }
}
