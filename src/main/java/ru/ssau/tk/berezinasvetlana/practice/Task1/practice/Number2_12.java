package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

public class Number2_12 {
    static double[] simple(int number) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }
        double[] array = new double[count * 2 + (Math.sqrt(number) == (int) Math.sqrt(number) ? 1 : 0)];
        int j = 0;
        for (int i = 0; i < (int) Math.sqrt(number); i++) {
            if (number % (i + 1) == 0) {
                array[j] = (i + 1);
                array[array.length - j - 1] = number / (i + 1);
                j++;
            }
        }
        return array;
    }
}
