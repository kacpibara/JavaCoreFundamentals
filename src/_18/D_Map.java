package _18;

import java.util.HashMap;
import java.util.Map;

public class D_Map {
    static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        // add items
        inventory.put("Dragon Egg", 1);
        inventory.put("Health Potion", 50);
        inventory.put("Empty Bottle", 0);
        inventory.put("Mana Potion", 1);

        // search
        System.out.println("How many 'Health Potion's' in stock? " + inventory.get("Health Potion"));

        // remove
        inventory.remove("Mana Potion");
        inventory.entrySet().removeIf(entry -> entry.getValue() == 0);

        System.out.println("Inventory after removing out-of-stock items: " + inventory);
    }
}
