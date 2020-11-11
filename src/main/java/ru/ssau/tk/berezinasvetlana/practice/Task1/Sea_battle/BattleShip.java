package ru.ssau.tk.berezinasvetlana.practice.Task1.Sea_battle;

import java.util.Scanner;

public class BattleShip {

    static String playerName1;
    static String playerName2;
    static Scanner scanner = new Scanner(System.in);
    static int[][] battlefield1 = new int[10][10];
    static int[][] battlefield2 = new int[10][10];

    public static void main(String[] args) {
        System.out.println("Player#1, please enter your name: ");
        playerName1 = scanner.nextLine();
        System.out.println("Player#2, please enter your name: ");
        playerName2 = scanner.nextLine();
        System.out.println("Участики, учтановите по одному однопалубному, двухпалубному, трехпалубному и четырехпалубному кораблю.");
    }

    public static void placeShips() {
        int deck = 4;
        while (deck >= 1) {
            System.out.println();
            System.out.println(playerName1 + " please place your" + deck + "-deck ship on the battlefield");
            System.out.println();
            System.out.println(" 0 1 2 3 4 5 6 7 8 9");

            System.out.println("Please enter OX coordinate: ");
            int x = scanner.nextInt();
            System.out.println("Please enter OY coordinate: ");
            int y = scanner.nextInt();
            System.out.println("Choose direction: ");
            System.out.println("1. Vertical. ");
            System.out.println("2. Horizontal. ");
            int direction = scanner.nextInt();
            for (int i = 0; i < deck; i++) {
                if (direction == 1) {
                    battlefield1[x][y + i] = 1;
                } else {
                    battlefield1[x + i][y] = 1;
                }
                deck--;
            }
        }
    }

    public static void drawField() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - - - - - - - - - -");
        }
    }
}

