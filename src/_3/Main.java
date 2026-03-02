package _3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {"lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "sed", "do", "eiusmod"};
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of string:" );
        int length = scanner.nextInt();

        for(int i = 0; i < length; i++) {
            String word = words[random.nextInt(words.length)];

            if(i == 0) {
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                sb.append(capitalizedWord + " ");
            }else if(i < length - 1){
                sb.append(word).append(" ");
            }else{
                sb.append(word).append(".");
            }

        }

        System.out.println(sb.toString());


    }
}
