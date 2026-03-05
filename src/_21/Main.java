package _21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static String generateRandomSpell() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder spell = new StringBuilder();
        Random random = new Random();

        for(int i = 0; i < 6; i++){
            int indiex = random.nextInt(alphabet.length());
            spell.append(alphabet.charAt(indiex));
        }
        return spell.toString();
    }
    public static void main(String[] args) {
        System.out.println("--- The Goblin's Spell Scroll ---");

        List<String> spellsToWrite = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            spellsToWrite.add(generateRandomSpell());
        }

        Path filePath = Paths.get("src/_21/secret_spells.txt");

        try{
            System.out.println("Writting magic word to the scroll...");
            Files.write(filePath, spellsToWrite);
            System.out.println("Scroll saved succesfully!");
        }catch(IOException e){
            System.out.println("Critical Error! " + e.getMessage());
        }

        try{
            System.out.println("--- Reading from the scroll ---");
            List<String> readSpells = Files.readAllLines(filePath);

            for(String spell : readSpells){
                System.out.println("- " + spell);
            }
        }catch(IOException e){
            System.out.println("Critical Error! " + e.getMessage());
        }
    }
}
