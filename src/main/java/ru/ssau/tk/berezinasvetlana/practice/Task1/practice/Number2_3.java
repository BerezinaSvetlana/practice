package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

public class Number2_3 {
    public static int[] Number(int size) {
        int[] array = new int[size];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = count;
            count = count + 2;
        }
        return array;
    }
}