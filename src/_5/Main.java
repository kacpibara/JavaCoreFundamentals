package _5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Podaj zakres tablicy");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

    }
}
