package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_;

public class Number2_6 {
    public static int[] Number(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[0] = 1;
            } else {
                array[i] = i * i;
            }

        }
        return array;
    }
}
