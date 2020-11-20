package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number2_3Test {

    @Test
    public void testNumber() {
        int[] arr = Number2_3.Number(100);
        assertEquals(arr[0], 1);
        assertEquals(arr[1], 3);
        assertEquals(arr[2], 5);
        assertEquals(arr[3], 7);
        assertEquals(arr[4], 9);
        assertEquals(arr[5], 11);
        assertEquals(arr[6], 13);
        assertNotEquals(arr[7], 9);
        assertNotEquals(arr[8], 11);
        assertNotEquals(arr[9], 13);
        assertEquals(arr.length, 100);
    }
}