package _26;

public class Main {
    static void main(String[] args) {
        System.out.println("--- The Enchanter's Workshop ---");

        MagicalItem sword = new EnchantedSword();
        MagicalItem wand = new ElderWand();

        sword.use();
        wand.use();

        System.out.println("\n--- Repairing Items ---");

        sword.repair();

        wand.repair();

        System.out.println("\n--- Identifying Item Types ---");

        MagicalItem.identify();
    }
}
