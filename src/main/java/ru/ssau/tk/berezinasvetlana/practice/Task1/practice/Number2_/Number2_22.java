package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_;

public class Number2_22 {
    static int getIndexOftenNumber(int[] array, int number) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                j = i;
            }
        }
        return j;
    }
}
