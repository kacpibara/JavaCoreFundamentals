package _18;

import java.util.HashSet;
import java.util.Set;

public class C_Set {
    static void main(String[] args) {
        Set<String> promoCodes = new HashSet<>();

        // add items
        promoCodes.add("GOBLIN50");
        promoCodes.add("NEWPLAYER");
        promoCodes.add("VIP");
        promoCodes.add("GOBLIN50"); // set ignores duplicates

        // search
        boolean hasVip = promoCodes.contains("VIP");
        System.out.println("Does it contain 'VIP'? " + hasVip);

        //remove
        promoCodes.removeIf(code -> code.length() < 4);
        System.out.println("Promo Codes after removing short ones: " + promoCodes);
    }



}
