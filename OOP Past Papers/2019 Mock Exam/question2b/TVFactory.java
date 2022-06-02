package question2b;

public class TVFactory extends AbstractFactory{

    @Override
    public MobilePhone getMobilePhone(String type) {
        return null;
    }

    @Override
    public TV getTV(String type) {
        if(type.equalsIgnoreCase("alpha40")){
            return new Alpha40();
        }
        else if (type.equalsIgnoreCase("Gamma50")) {
            return new Gamma50();
        }
        else if (type.equalsIgnoreCase("Theta65")) {
            return new Theta65();
        }
        else {
            return null;
        }
    }
}
