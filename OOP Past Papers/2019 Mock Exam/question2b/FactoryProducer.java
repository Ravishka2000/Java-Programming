package question2b;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("mobile")){
            return new MobileFactory();
        }
        else if (choice.equalsIgnoreCase("tv")) {
            return new TVFactory();
        }
        else {
            return null;
        }
    }
}
