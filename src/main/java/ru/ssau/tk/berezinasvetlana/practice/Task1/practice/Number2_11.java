package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

public class Number2_11 {
    static double[] function(int n) {
        double[] array = new double[n];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (0 == (n % i)) {
                array[i]= i;
            }
        }
        return  array;
    }
}
