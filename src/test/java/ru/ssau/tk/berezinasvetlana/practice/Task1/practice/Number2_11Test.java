package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number2_11Test {

    @Test
    public void testFunction() {
        final double DELTA = 0.00001;
        double[] array = Number2_11.function(6);
        double[] array_1 = Number2_11.function(8);
        double[] array_2 = Number2_11.function(10);
        assertEquals(array.length,6);
        assertEquals(array[0],0.0);
        assertEquals(array[1],1.0);
        assertEquals(array[2],2.0);

        assertEquals(array_1[0],0.0);
        assertEquals(array_1[1],1.0);
        assertEquals(array_1[2],2.0);

        assertEquals(array_2[0],0.0);
        assertEquals(array_2[1],1.0);
        assertEquals(array_2[2],2.0);

    }
}