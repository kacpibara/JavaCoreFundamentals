package _04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Enter a string: ");
            String string = scanner.next();
            strings.add(string);
        }

        System.out.println(strings);

        strings.remove(random.nextInt(strings.size()));

        System.out.println(strings);
    }
}
