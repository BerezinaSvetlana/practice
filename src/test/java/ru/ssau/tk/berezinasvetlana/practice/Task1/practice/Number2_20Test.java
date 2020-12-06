package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number2_20Test {

    @Test
    public void testSetArray() {
        int[] array = new int[]{3, 6, 9, 12, 15, 21, 6};
        int[] array_1 = new int[]{20,3,6,9,12,15,21,3};
        assertTrue(Number2_20.setArray(array));
        assertFalse(Number2_20.setArray(array_1));
    }
}