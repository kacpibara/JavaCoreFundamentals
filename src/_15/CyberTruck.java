package _15;

public class CyberTruck implements Movable{
    private int batteryLevel;

    public CyberTruck(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void move() {
        batteryLevel -= 20;
        System.out.println("CyberTruck accelerates silently to 100km/h! Battery left: " + batteryLevel);
    }
}
