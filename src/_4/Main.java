package _4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while(strings.size()<5){
            System.out.println("Enter a string: ");
            String string = scanner.nextLine();
            strings.add(string);
        }

        System.out.println(strings);

        strings.remove(random.nextInt(strings.size()));

        System.out.println(strings);
    }
}
