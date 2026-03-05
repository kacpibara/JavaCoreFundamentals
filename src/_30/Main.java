package _30;

import java.util.*;

public class Main {

    public static void measureTime(String operationName, Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("%-20s took: %4d ms", operationName, (endTime - startTime)));
    }

    public static void main(String[] args) {
        System.out.println("--- The Kingdom's Census Performance Test ---\n");

        int elementsCount = 100_000;
        System.out.println("Testing with " + elementsCount + " citizens...\n");

        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        Map<Integer, String> hashMap = new HashMap<>();

        System.out.println("[1] ADDING ELEMENTS");

        measureTime("ArrayList Add", () -> {
            for (int i = 0; i < elementsCount; i++) arrayList.add(i);
        });

        measureTime("HashSet Add", () -> {
            for (int i = 0; i < elementsCount; i++) hashSet.add(i);
        });

        measureTime("HashMap Add", () -> {
            for (int i = 0; i < elementsCount; i++) hashMap.put(i, "Citizen_" + i);
        });

        // ==========================================
        System.out.println("\n[2] SEARCHING ELEMENTS");
        int searchStart = elementsCount - 10_000;

        measureTime("ArrayList Search", () -> {
            for (int i = searchStart; i < elementsCount; i++) arrayList.contains(i);
        });

        measureTime("HashSet Search", () -> {
            for (int i = searchStart; i < elementsCount; i++) hashSet.contains(i);
        });

        measureTime("HashMap Search", () -> {
            for (int i = searchStart; i < elementsCount; i++) hashMap.containsKey(i);
        });

        System.out.println("\n[3] REMOVING ELEMENTS");

        measureTime("ArrayList Remove", () -> {
            for (int i = searchStart; i < elementsCount; i++) {
                arrayList.remove(Integer.valueOf(i));
            }
        });

        measureTime("HashSet Remove", () -> {
            for (int i = searchStart; i < elementsCount; i++) hashSet.remove(i);
        });

        measureTime("HashMap Remove", () -> {
            for (int i = searchStart; i < elementsCount; i++) hashMap.remove(i);
        });
    }
}