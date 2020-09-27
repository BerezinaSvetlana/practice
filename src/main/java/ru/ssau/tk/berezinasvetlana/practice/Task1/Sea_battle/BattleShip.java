package ru.ssau.tk.berezinasvetlana.practice.Task1.Sea_battle;

import java.util.Scanner;

public class BattleShip {

    static String playerName1;
    static String playerName2;
    static Scanner scanner = new Scanner(System.in);
    static int [][] battlefield1 = new int[10][10];
    static int [][] battlefield2 = new int[10][10];

    public static void main(String[] args) {
        System.out.println("Player#1, please enter your name: ");
        playerName1 = scanner.nextLine();
        System.out.println("Player#2, please enter your name: ");
        playerName2 = scanner.nextLine();
        System.out.println("Участики, учтановите по одному однопалубному, двупалубному, трупалубному и четревопалубному кораблю.");
    }

    public static void drawField() {
        System.out.println();

        System.out.println(playerName1 + " please place your 4-deck ship on the battlefield");
        System.out.println();
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - - - - - - - - - -");
        }
        System.out.println("Please enter OX coordinate: ");
        int x = scanner.nextInt();
        System.out.println("Please enter OY coordinate: ");
        int y = scanner.nextInt();
        System.out.println("Choose direction: ");
        System.out.println("1. Vertical. ");
        System.out.println("2. Horizontal. ");
        int rotation = scanner.nextInt();

        for (int i = 0; i < battlefield1.length; i++) {
            for (int j = 0; j < battlefield1.length; j++) {

            }

        }
    }
}
