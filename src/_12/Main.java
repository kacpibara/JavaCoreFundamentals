package _12;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Welcome to the Goblin's Tavern! ---");
        System.out.println("--- What would you like to order? ---");
        System.out.println("--- 1. Health Potion (-20 Gold) ---");
        System.out.println("--- 2. Mana Potion (-50 Gold) ---");
        System.out.println("--- 3. Dwarven Ale Potion ( -75 Gold) ---");
        System.out.println("--- 4. Elf and onion soup, Good (- 100 Gold) ---");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("--- Health Potion (+50 HP) ---");
                break;
            case 2:
                System.out.println("--- Mana Potion (+30 MP) ---");
                break;
            case 3:
                System.out.println("--- Dwarven Ale Potion (Strength +5) ---");
                break;
            case 4:
                System.out.println("--- Do you want to eat? ---");
                System.out.println("--- 1. Yes ---");
                System.out.println("--- 2. No, I', not hungry! ---");
                int choiceSoup = scanner.nextInt();
                switch (choiceSoup) {
                    case 1:
                        System.out.println("--- Elf and onion Soup (+100 Sigma xd) ---");
                        break;
                    case 2:
                        System.out.println("--- Dummy, Elf soup Good! ---");
                        break;
                    default:
                        System.out.println(" ---Wrong choice! ---");
                }
                break;
            default:
                System.out.println("Dummy, Wrong choice!");
                break;
        }
    }
}
