package _27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main{
    static void main(String[] args) {
        System.out.println("--- The Adventurer's Guild ---");

        // Lambdas as variables
        AttackStrategy fireSpell = (target) -> System.out.println("Casting Fireball on: " + target);
        AttackStrategy swordSlash = (target) -> System.out.println("Slashing at: " + target);

        System.out.println("\n--- Executing Custom Attacks ---");
        fireSpell.attack("Goblin");
        swordSlash.attack("Dragon");

        // lambdas in Collections
        List<String> heroes = new ArrayList<>();
        heroes.add("Zelda");
        heroes.add("Arthur");
        heroes.add("Merlin");
        heroes.add("Lancelot");

        System.out.println("\n--- Sorting Heroes with Lambda ---");

        //heroes.sort((h1, h2) -> h1.compareTo(h2));
        heroes.sort(Comparator.naturalOrder());
        // heroes.sort((h1, h2) -> h2.compareTo(h1));
        heroes.sort(Comparator.reverseOrder());

        System.out.println("\n--- Printing Heroes with forEach Lambda ---");

        heroes.forEach(hero -> System.out.println("Brave Hero: " + hero));
    }
}
