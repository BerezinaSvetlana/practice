package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

public class Number2_15 {
    static boolean setArray(int[] array, int number) {
        for (int j : array) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
