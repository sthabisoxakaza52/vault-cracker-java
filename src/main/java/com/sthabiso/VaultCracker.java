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

    int min = 1;
    int max;
    int maxAttempts;
    int baseScore;

    if (choice == 1) {
        max = 50;
        maxAttempts = 10;
        baseScore = 100;
        System.out.println("\n**ROOKIE** Initialising breach sequence...\n");

    } else if (choice == 2) {
        max = 100;
        maxAttempts = 7;
        baseScore = 200;
        System.out.println("\n**OPERATIVE** Encryption detected .Proceeding with caution...\n");

    } else if (choice == 3) {
        max = 200;
        maxAttempts = 5;
        baseScore = 300;
        System.out.println("\n**GHOST** Maximum security vault .One wrong move and it's over.\n");

    } else {
        System.out.println("Invalid selected. Defaulting to ROOKIE.");
        max = 50;
        maxAttempts = 10;
        baseScore = 100;
    }


    int secretCode = generateCode(min, max);
    playGame(secretCode, min, max, maxAttempts, baseScore);
}

    static int generateCode(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    static String evaluateGuess(int secret, int guess) {
        if (guess < secret) {
            return "low";
        } else if (guess > secret) {
            return "high";
        } else {
            return "correct";
        }
    }

    static int calculateScore(int baseScore, int attempts) {
        int score = baseScore - (attempts * 10);
        if (score < 0) {
            return 0;
        }
        return score;
    }

    static void playGame(int secretCode, int min, int max, int maxAttempts, int baseScore) {
        int attempts = 0;

        System.out.println("The vault code is a number between " + min + " and " + max + ".");
        System.out.println("You have " + maxAttempts + " attempts. Choose wisely.\n");

        while (attempts < maxAttempts) {
            System.out.print("Enter code: ");
            int guess = scanner.nextInt();
            attempts++;

            String result = evaluateGuess(secretCode, guess);

            if (result.equals("correct")) {
                int score = calculateScore(baseScore, attempts);
                System.out.println("\n>> ACCESS GRANTED. Vault opened.");
                System.out.println(">> Attempts used: " + attempts);
                System.out.println(">> Your score:    " + score);
                playAgain();
                return;
            } else if (result.equals("high")) {
                System.out.println(">> Signal too strong. Dial it back.");
            } else {
                System.out.println(">> Signal too weak. Push higher.");
            }

            int remaining = maxAttempts - attempts;
            System.out.println(">> Attempts remaining: " + remaining + "\n");
        }

        System.out.println("\n>> VAULT LOCKED. Security triggered.");
        System.out.println(">> The code was: " + secretCode);
        System.out.println(">> Your score:   0");
        playAgain();
    }

    static void playAgain() {
        System.out.print("\nAttempt another breach? (yes/no): ");
        String answer = scanner.next();

        if (answer.equalsIgnoreCase("yes")) {
            chooseMode();
        } else {
            System.out.println("\n>> Disconnecting...");
            System.out.println(">> Session terminated. Leave no trace.");
        }
    }
}














