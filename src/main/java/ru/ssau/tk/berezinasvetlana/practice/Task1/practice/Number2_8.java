package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

public class Number2_8 {
    static double[] Number(int size) {
        double[] array = new double[size];
        int j = 1;
        for (int i = 0; i < array.length; i++) {
            if (j % 3 == 0) {
                j++;
            }
            array[i] = j;
            j++;
        }
        return array;
    }
}
