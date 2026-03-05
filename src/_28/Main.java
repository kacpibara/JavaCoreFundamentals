package _28;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class Main {
    public static void main() {
        System.out.println("--- The Merchant's Ledger ---");

        List<Product> inventory = new ArrayList<>();
        inventory.add(new Product("Wooden Shield", 25.0));
        inventory.add(new Product("Excalibur", 1500.0));
        inventory.add(new Product("Health Potion", 10.0));
        inventory.add(new Product("Dragon Armor", 800.0));
        inventory.add(new Product("Magic Ring", 300.0));

        double minPrice = 100.0;
        Predicate<Product> isPremium = product -> product.getPrice() > minPrice;

        System.out.println("Premium products (price > " + minPrice + "):");
        inventory.stream()
                .filter(isPremium)
                .forEach(p -> System.out.println("- " + p));

        double budgetLimit = 3000.0;

        ToDoubleFunction<Product> getPrice = Product::getPrice;

        double totalPremiumValue = inventory.stream()
                .filter(isPremium)
                .mapToDouble(getPrice)
                .sum();

        boolean isWithinBudget = totalPremiumValue < budgetLimit;

        System.out.println("\n--- Financial Summary ---");
        System.out.println("Total value of Premium items: " + totalPremiumValue + " gold");
        System.out.println("Is the total value under the budget (" + budgetLimit + ")? " + isWithinBudget);
    }
}
