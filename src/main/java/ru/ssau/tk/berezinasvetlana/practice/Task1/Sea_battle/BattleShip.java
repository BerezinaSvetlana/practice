package ru.ssau.tk.berezinasvetlana.practice.Task1.Sea_battle;

import java.util.Scanner;

public class BattleShip {

    static String playerName1;
    static String playerName2;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Player#1, please enter your name: ");
        playerName1 = scanner.nextLine();
        System.out.println("Player#2, please enter your name: ");
        playerName2 = scanner.nextLine();

        System.out.println();
        System.out.println(playerName1 + " please place your ship on the battlefield");
        System.out.println();
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - - - - - - - - - -");
        }
    }

    public static void drawField() {

    }

}
