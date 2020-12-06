package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

public class Number2_10 {
    static double[] geometric_function(double first, double step, int dim) {
        double[] array = new double[dim];
        array[0] = first;
        for (int i = 1; i < dim; i++) {
            array[i] = array[i - 1] * step;
        }
        return array;
    }
}
