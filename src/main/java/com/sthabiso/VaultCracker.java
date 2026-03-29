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
    System.out.println("Mode selected: " + choice);
}

}







