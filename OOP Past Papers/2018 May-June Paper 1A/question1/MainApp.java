package question1;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {

		ArrayList<Item> items = new ArrayList<>();
		
		items.add(new Book(1, "Sherlock", 1500, "Pravini", "Crime", 565));
		items.add(new Book(2, "Appachchi", 5500, "Ravishka", "Horror", 2500));
		
		items.add(new Car(3, "Lambo", 1000000, "Lambogini", "Car"));
		items.add(new Car(4, "Mini", 800000, "Mini Cooper", "SUV"));
		
		for(Item it : items) {
			it.display();
		}
	}

}
