package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_;

public class Number2_4 {
    public static int[] Number(int size) {
        int[] array = new int[size];
        int count = size * 2;
        for (int i = 0; i < array.length; i++) {
            array[i] = count;
            count = count - 2;
        }
        return array;
    }
}
