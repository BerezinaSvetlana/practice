package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_;

public class Number2_20 {
    static boolean setArray(int[] array) {
        int count_1 = 0;
        int count_2 = 0;
        for (int j : array) {
            if (j % array[0] == 0)
                count_1++;
        }
        for (int i : array) {
            if (i % array[array.length - 1] == 0)
                count_2++;
        }
        return count_1 > count_2;
    }
}
