package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_;

public class Number2_26 {
    static int[] Sum_Array(int[] array) {
        int[] array_1 = new int[array.length / 2 + (array.length % 2 == 0 ? 0 : 1)];
        for (int i = 0; i < array_1.length; i++) {
            array_1[i] = array[2 * i] + (2 * i + 1 < array.length ? array[2 * i + 1] : 0);
        }
        return array_1;
    }
}
