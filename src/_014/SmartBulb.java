package _014;

public class SmartBulb implements SmartDevice{
    private String color;
    private int brightness;

    public SmartBulb(String color, int brightness) {
        this.color = color;
        this.brightness = brightness;
    }

    @Override
    public String getStatus() {
        return "Smart Bulb is shinining in " + color + " with " + brightness + "%";
    }
}
