package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_31;

public class Matrix {
    private double[][] array;
    private final int n;
    private final int m;

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public Matrix(int n, int m) {
        this.m = m;
        this.n = n;
        array = new double[n][m];
    }

    public double getAt(int n, int m) {
        return array[n][m];
    }

    public void setAt(int n, int m, double number) {
        array[n][m] = number;
    }
}
