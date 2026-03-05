package _18;

import java.util.ArrayList;
import java.util.List;

public class B_List {
    static void main(String[] args) {
        List<String> shoppingCart = new ArrayList<>();

        // add items
        shoppingCart.add("Magic Wand");
        shoppingCart.add("Rotten Apple");
        shoppingCart.add("Health Potion");
        shoppingCart.add("Rotten Apple"); // duplicate is allowed

        // search
        System.out.println("Does cart contain 'Magic Wand'? " + shoppingCart.contains("Magic Wand"));

        // remove
        shoppingCart.removeIf(item -> item.startsWith("Rotten"));

        // display
        System.out.println("Shopping cart after removing items:" + shoppingCart);
    }
}
