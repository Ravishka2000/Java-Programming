package question2b;

public class MobileFactory extends AbstractFactory{
    @Override
    public MobilePhone getMobilePhone(String type) {
        if(type.equalsIgnoreCase("A10")){
            return new A10();
        }
        else if(type.equalsIgnoreCase("TPlus")){
            return new TPlus();
        }
        else if(type.equalsIgnoreCase("X25")){
            return new X25();
        }
        else {
            return null;
        }
    }

    @Override
    public TV getTV(String type) {
        return null;
    }


}
