package _2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of string:" );
        int length = scanner.nextInt();

        for(int i = 0; i < length; i++){
            sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }

        String result = sb.toString();
        System.out.println(result);
    }
}
