package question2b;

public abstract class AbstractFactory {
    public abstract MobilePhone getMobilePhone(String type);
    public abstract TV getTV(String type);
}
