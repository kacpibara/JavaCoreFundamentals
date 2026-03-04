package _014;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SmartDevice> homeDevices = new ArrayList<>();
        homeDevices.add(new SmartBulb("Red", 80));
        homeDevices.add(new SmartBulb("Warm White", 40));
        homeDevices.add(new SmartThermostat(21.0, 23.5));
        homeDevices.add(new SecurityCamera(true, "4K"));

        System.out.println("--- Starting Smart Home Hub ---");

        for (SmartDevice device : homeDevices) {
            System.out.println(device.getStatus());
        }

        System.out.println("--- All devices checked ---");
    }
}
