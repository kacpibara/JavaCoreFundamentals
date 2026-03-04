package _11;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> galaxy = new LinkedHashMap<>();
        galaxy.put("Mars", "Empty");
        galaxy.put("Venus", "Toxic");
        galaxy.put("Jupiter", "Gas");
        galaxy.put("Kepler", "Cold");
        galaxy.put("Sream", "Empty");
        galaxy.put("Earth", "Ideal");

        System.out.println("--- Starting space exploration mission ---");

        for (Map.Entry<String, String> planet : galaxy.entrySet()) {
            String name = planet.getKey();
            String status = planet.getValue();

            System.out.println("Scanning: " + name + "...");

            if (status.equals("Toxic") || status.equals("Gas") || status.equals("Cold")) {
                System.out.println("   -> Danger detected! Planet is " + status + ". Skipping...");
                continue;
            }

            if (status.equals("Ideal")) {
                System.out.println("   -> Success! Found an " + status + " planet. Initiating landing sequence.");
                break;
            }

            System.out.println("   -> Nothing interesting here. Moving on.");
        }

        System.out.println("--- Ending space exploration mission ---");
    }
}
