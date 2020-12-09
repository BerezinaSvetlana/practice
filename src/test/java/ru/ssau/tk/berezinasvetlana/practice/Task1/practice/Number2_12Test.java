package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number2_12Test {

    @Test
    public void testSimple() {
        final double DELTA = 0.0001;
        double[] firstArray = Number2_12.simple(6);
        assertEquals(firstArray[0], 1, DELTA);
        assertEquals(firstArray[1], 2, DELTA);
        assertEquals(firstArray[2], 3, DELTA);
        assertEquals(firstArray[3], 6, DELTA);
        assertEquals(firstArray.length, 4, DELTA);
    }
}
