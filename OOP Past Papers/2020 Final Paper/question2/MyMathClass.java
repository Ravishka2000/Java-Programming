package question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyMathClass <T,V extends Number> {
	
	public void average(HashMap<T, V> hashMap) {
		
		double tot = 0;
		
		for(Map.Entry<T,V> m : hashMap.entrySet()) {
			tot += m.getValue().doubleValue();
		}
		
		System.out.println("Average : " + tot/hashMap.size());
		
	}
	
	public ArrayList<V> convertTo(HashMap<T, V> hashMap) {
		
		ArrayList<V> list = new ArrayList<>();
		
		for(Map.Entry<T,V> m : hashMap.entrySet()) {
			list.add(m.getValue());
		}
		
		return list;
	}

}
