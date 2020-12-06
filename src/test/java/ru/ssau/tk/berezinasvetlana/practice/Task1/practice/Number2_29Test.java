package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number2_29Test {

    @Test
    public void testGetArray() {
        int[] array = Number2_29.getArray(5, 3);
        int[] array_1 = Number2_29.getArray(3, 2);
        assertEquals(array[0], 3);
        assertEquals(array[1], 4);
        assertEquals(array[2], 5);
        assertEquals(array[3], 1);
        assertEquals(array_1[0], 2);
        assertEquals(array_1[1], 3);
        assertEquals(array_1[2], 1);
    }
}