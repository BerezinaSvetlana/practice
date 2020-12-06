package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number2_8Test {

    @Test
    public void testNumber() {
        final double DELTA = 0.00001;
        double[] array = Number2_8.Number(20);
        assertEquals(array[0], 1, DELTA);
        assertEquals(array[1], 2, DELTA);
        assertNotEquals(array[2], 3, DELTA);
        assertEquals(array[2], 4, DELTA);
        assertEquals(array[3], 5, DELTA);
        assertEquals(array[5], 8, DELTA);
        assertEquals(array[6], 10, DELTA);
        assertNotEquals(array[9], 12, DELTA);
    }
}
