package _13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Do-While Loop
        // 'do/while' executes the loop body AT LEAST ONCE before checking the condition.
        final int secretPIN = 777;
        Scanner scanner = new Scanner(System.in);
        int enteredPIN;

        do{
            System.out.println("Enter the secret PIN to open the vault: ");
            enteredPIN = scanner.nextInt();
            if(enteredPIN != secretPIN){
                System.out.println("Invalid secret PIN");
            }
        }while(enteredPIN != secretPIN);

        System.out.println("Success! The vault is open!");
        scanner.close();

        // While Loop
        // 'while' checks the condition BEFORE executing the loop body (might not run at all).
        int vaultGold = 50;
        while(vaultGold > 0){
            System.out.println("Stealing 10 gold coins...");
            vaultGold -= 10;
            System.out.println("Gold left in vault: " + vaultGold);
        }

        System.out.println("The vault is completely empty. Time to run!");

    }
}
