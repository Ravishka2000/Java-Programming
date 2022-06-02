package question2b;

public class FactoryDemo {
    public static void main(String[] args) {

        AbstractFactory mobileFactory = FactoryProducer.getFactory("mobile");
        MobilePhone mobilePhone = mobileFactory.getMobilePhone("a10");
        mobilePhone.display();

        AbstractFactory tvfactory = FactoryProducer.getFactory("tv");
        TV tv = tvfactory.getTV("alpha40");
        tv.display();

    }
}
