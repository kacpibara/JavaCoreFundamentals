package _6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        RegularPrism[] staticPrisms = new RegularPrism[rand.nextInt(10)+ 1];

        // static array
        for(int i = 0; i < staticPrisms.length; i++) {
            int randomSides = rand.nextInt(100);
            double randomEdge = Math.round(rand.nextDouble() * 100.0);
            double randomHeight = Math.round(rand.nextDouble() * 100.0);
            staticPrisms[i] = new RegularPrism(randomSides, randomEdge, randomHeight);
            System.out.println("New regular prism: " + staticPrisms[i]);
        }

        System.out.println("All static array" + Arrays.toString(staticPrisms));


        // dynamic list
        List<RegularPrism> regularPrismList = new ArrayList<>();
        int listSize = rand.nextInt(5)+1;
        for(int i = 0; i < listSize; i++) {
            int randomSides = rand.nextInt(100);
            double randomEdge = Math.round(rand.nextDouble() * 100.0);
            double randomHeight = Math.round(rand.nextDouble() * 100.0);
            RegularPrism regularPrism = new RegularPrism(randomSides, randomEdge, randomHeight);
            regularPrismList.add(regularPrism);
        }

        for(RegularPrism prism : regularPrismList) {
            System.out.println("added to dynamic list: " + prism);
        }

        System.out.println("All dynamic array" + regularPrismList);
    }
}
