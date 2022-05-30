package question2b;

import java.util.Map;
import java.util.TreeMap;

public class AscendingTable <K,V>{

    TreeMap<K,V> mytree = new TreeMap<>();

    public static <K, V> void display(AscendingTable<K, V> myTable) {

        for(Map.Entry<K,V> entry : myTable.mytree.entrySet()){
            System.out.println(entry.getKey() +", " + entry.getValue());
        }
    }

    public void add(K key, V value) {
        mytree.put(key, value);
    }
}
