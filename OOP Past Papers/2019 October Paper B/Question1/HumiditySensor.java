package Question1;

public class HumiditySensor implements ISensor{

    private String name;

    public HumiditySensor(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println("Humidity sensor Switch On");
    }

    @Override
    public void off() {
        System.out.println("Humidity sensor Switch Off");
    }
}