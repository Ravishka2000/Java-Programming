package question2;

import java.util.HashMap;

public class MyMain {

	public static void main(String[] args) {
		
		HashMap<Integer, Double> map = new HashMap<>();
		
		MyMathClass<Integer, Double> mathClass = new MyMathClass<>();
		
		map.put(1,10.0);
		map.put(2,20.0);
		map.put(3,30.0);
		map.put(4,40.0);
		map.put(5,50.0);
		
		mathClass.average(map);
		System.out.println(mathClass.convertTo(map));
		
	}

}
