package _29;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static void main(String[] args) {
        System.out.println("--- The Illusionist's Guild ---");

        // Old Way - local variables
        String oldMageName = "Gandalf";
        int oldMageLevel = 99;

        // New Way - cimpilator knows that this is String and Int
        var mageName = "Merlin";
        var mageLevel = 100;

        System.out.println("Mage: " + mageName + ", Level: " + mageLevel);

        // mageLevel = "One Hundred"; - cant change value of variable after declaration

        // Use for collections
        var spellBook = new HashMap<String, ArrayList<String>>();

        var fireSpells = new ArrayList<String>();
        fireSpells.add("Fireball");
        fireSpells.add("Meteor Shower");

        spellBook.put("Fire Magic", fireSpells);

        System.out.println("Spells in the book:");
        for (var spell : fireSpells) {
            System.out.println("- " + spell);
        }
    }


}
