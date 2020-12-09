package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

public class Number2_27 {
    static boolean[] setArray(int[] array) {
        boolean[] array_1 = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            array_1[i] = array[i] % 2 == 0;
        }
        return array_1;
    }
}
