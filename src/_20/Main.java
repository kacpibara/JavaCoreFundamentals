package _20;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> bossLoot = new ArrayList<>();
        bossLoot.add("Gold Coin");
        bossLoot.add("Dragon Scale");
        bossLoot.add("Rusty Dagger");

        System.out.println("--- Opening Boss Chest ---");
        System.out.println("You found:");

        // Classic For Loop
        // for (int i = 0; i < bossLoot.size(); i++) {
        //     System.out.println("- " + bossLoot.get(i));
        // }

        // For-Each Loop
        for (String item : bossLoot) {
            System.out.println("- " + item);
        }
    }
}