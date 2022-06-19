package Question1;

public class RainFallSensor implements ISensor{

    private String name;

    public RainFallSensor(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println("Rainfall sensor Switch On");
    }

    @Override
    public void off() {
        System.out.println("Rainfall sensor Switch Off");
    }
}
