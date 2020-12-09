package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number2_7Test {
    final double DELTA = 0.001;

    @Test
    public void _1test() throws Exception {
        double[] _1test = Number2_7.discriminant(1, 1, -2);
        double[] _2test = Number2_7.discriminant(1, 1, 0.25);
        assertEquals(_1test[0], 1, DELTA);
        assertEquals(_1test[1], -2, DELTA);
        assertEquals(_2test[0], -0.5, DELTA);
        assertEquals(_2test.length, 1);
    }

    @Test
    public void _2test() throws Exception {
        double[] _2test = Number2_7.discriminant(0, 2, -4);
        assertEquals(_2test[0], 2, DELTA);
    }

    @Test
    public void testNuN() throws Exception {
        try {
            double[] DoesNotExist = Number2_7.discriminant(0, 0, 8);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Решения нет.");
        }

        try {
            double[] emptyEqution = Number2_7.discriminant(0, 0, 0);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Решение принадлежит области комлпексных чисел.");
        }

        try {
            double[] ComplexNumbers = Number2_7.discriminant(1, 3, 7);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Решение не относится к области вещественных чисел.");
        }
    }

}