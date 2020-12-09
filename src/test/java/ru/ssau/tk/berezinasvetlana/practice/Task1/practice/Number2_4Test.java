package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_4;

import static org.testng.Assert.*;

public class Number2_4Test {

    @Test
    public void testNumber() {
        int[] arr = Number2_4.Number(10);
        assertEquals(arr[0], 20);
        assertEquals(arr[1], 18);
        assertEquals(arr[2], 16);
        assertEquals(arr[3], 14);
        assertEquals(arr[4], 12);
        assertEquals(arr[5], 10);
        assertEquals(arr[6], 8);
        assertEquals(arr[7], 6);
        assertEquals(arr[8], 4);
        assertEquals(arr[9], 2);
        assertNotEquals(arr[0], 2);
        assertNotEquals(arr[5], 12);
    }
}