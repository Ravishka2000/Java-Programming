package question4;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Vehicle truck = new Truck(100,5000000,"Black",5000);
        Vehicle bus = new Bus(180,8000000,"White",2019,100000);

        System.out.println("Sale price of the Truck : " + truck.getRegularPrice());
        System.out.println("Sale price of the Bus : " + bus.getRegularPrice());
    }
}
