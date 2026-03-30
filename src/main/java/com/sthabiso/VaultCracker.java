package com.sthabiso;

import java.util.Scanner;
import java.util.Random;

public class VaultCracker {
    static Scanner scanner = new Scanner(System.in);
    static  Random random = new Random();

public static void main(String[] args) {
    showIntro();
    chooseMode();
}

static void showIntro() {
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    System.out.println("        :: THE VAULT CRACKER ::         ");
    System.out.println("You've infiltrated the facility.");
    System.out.println("One locked vault stands between you.");
    System.out.println("and the classified files inside.");
    System.out.println("Crack the code.Leave no trace.");
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
}

static void chooseMode() {
    System.out.println("Select breach level:");
    System.out.println("1 - ROOKIE (1 - 50, 10 attempts)");
    System.out.println("2 - OPERATIVE (1 - 100, 7 attempts)");
    System.out.println("3 - GHOST (1 - 200, 5 attempts)");
    System.out.println("\nEnter choice: ");

    int choice = scanner.nextInt();

    int min = 1 ;
    int max;
    int maxAttempts;
    int baseScore;

    if (choice == 1) {
        max = 50;
        maxAttempts = 10;
        baseScore = 100;
        System.out.println("\n**ROOKIE** Initialising breach sequence...\n");

    }else if (choice == 2) {
        max = 100;
        maxAttempts = 7;
        baseScore = 200;
        System.out.println("\n**OPERATIVE** Encryption detected .Proceeding with caution...\n");

    }else if (choice == 3) {
        max = 200;
        maxAttempts = 5;
        baseScore = 300;
        System.out.println("\n**GHOST** Maximum security vault .One wrong move and it's over.\n");
    }else{
        System.out.println("Invalid selected. Defaulting to ROOKIE.");
        max = 50;
        maxAttempts = 10;
        baseScore = 100;

    }
}

}







