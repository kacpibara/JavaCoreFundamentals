package _25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- The Blacksmith's Forge ---");

        // Old Way - Without Diamonds Notation <>
        List<String> oldSwordCrate = new ArrayList<String>();
        oldSwordCrate.add("Iron Sword");

        // with complex types it's nightmare
        Map<String, List<Integer>> oldComplexMap = new HashMap<String, List<Integer>>();


        // New Way - With Diamon Notation <>
        List<String> modernSwordCrate = new ArrayList<>();
        modernSwordCrate.add("Steel Sword");

        // complex types are more readable
        Map<String, List<Integer>> modernComplexMap = new HashMap<>();

        System.out.println("Old crate contains" + oldSwordCrate.get(0));
        System.out.println("Modern crate contains: " + modernSwordCrate.get(0));
    }
}
