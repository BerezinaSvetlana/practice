package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

public class Number2_17 {
    static int Quantity(int[] array) {
        int count = 0;
        for (int i : array) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
