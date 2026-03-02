package _1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Gdy wiadomo ile jest liczb użyjemy tablicy []
        int[] staticNumbers = {1,2,3,4,5,6,7,8,9,10};
        int[][] multidimensionalStaticArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(staticNumbers));
        System.out.println(Arrays.toString(multidimensionalStaticArray)); // to wypsize referencje do pamięci dla każdego wiersza
        System.out.println(Arrays.deepToString(multidimensionalStaticArray));

        for(int i = 0; i < staticNumbers.length; i++) {
            System.out.println(staticNumbers[i]);
        }

        for(int i = 0; i < multidimensionalStaticArray.length; i++) {
            for(int j = 0; j < multidimensionalStaticArray[i].length; j++) {
                System.out.print(multidimensionalStaticArray[i][j] + " ");
            }
            System.out.println();
        }

        for(int n : staticNumbers) {
            System.out.println(n);
        }

        for(int[] row : multidimensionalStaticArray) { // Wyciagamy najpierw caly wiersz
            for(int val : row) {                 // Iterujemy po wartosciach w wierszu
                System.out.print(val + " ");
            }
            System.out.println();
        }



        // Gdy w trakcie działania programu będą dodawane lub usuwane wartości użyjemy ArrayList
        // List<Integer ... = new ArrayList<>(); - pamiętaj JAVA generics
        List<Integer> dynamicNumbers = new ArrayList<>();

        // dodawanie elementów
        dynamicNumbers.add(1);
        dynamicNumbers.add(2);
        dynamicNumbers.add(3);
        dynamicNumbers.add(4);
        dynamicNumbers.add(5);
        dynamicNumbers.add(6);
        dynamicNumbers.add(7);

        System.out.println("Dynamiczna lista: " + dynamicNumbers);

        // usuwanie elementu po wartości
        dynamicNumbers.remove(Integer.valueOf(5));
        System.out.println("Dynamiczna lista: " + dynamicNumbers);

        // Usuwanie elemenntu po indeksie
        dynamicNumbers.remove(2);

        System.out.println("Dynamiczna lista: " + dynamicNumbers);
    }
}
