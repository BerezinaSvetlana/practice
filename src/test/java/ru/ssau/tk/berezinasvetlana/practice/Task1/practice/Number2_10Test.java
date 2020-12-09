package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_10;

import static org.testng.Assert.*;

public class Number2_10Test {

    @Test
    public void testGeometric_function() {
        final double DELTA = 0.00001;
        double[] array = Number2_10.geometric_function(1, 2, 11);
        assertEquals(array.length, 11);
        assertEquals(array[0], 1, DELTA);
        assertEquals(array[1], 2, DELTA);
        assertEquals(array[2], 4, DELTA);
        assertEquals(array[3], 8, DELTA);
        assertEquals(array[4], 16, DELTA);
        assertEquals(array[5], 32, DELTA);
        assertEquals(array[6], 64, DELTA);
        assertEquals(array[7], 128, DELTA);
        assertNotEquals(array[8], 1, DELTA);
        assertNotEquals(array[9], 1, DELTA);
        assertNotEquals(array[10], 1, DELTA);
    }
}