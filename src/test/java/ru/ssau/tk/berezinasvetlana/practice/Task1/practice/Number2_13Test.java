package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_13;

import static org.testng.Assert.*;

public class Number2_13Test {

    @Test
    public void testGetArray() {
        int[] array = Number2_13.getArray(11);
        int[] array_1 = Number2_13.getArray(7);
        assertEquals(array[0], 1);
        assertEquals(array[1], 2);
        assertEquals(array[2], 3);
        assertEquals(array[3], 4);
        assertEquals(array[4], 5);
        assertEquals(array[5], 6);
        assertEquals(array[6], 5);
        assertEquals(array[7], 4);
        assertEquals(array[8], 3);
        assertEquals(array[9], 2);
        assertEquals(array[10], 1);

        assertEquals(array_1[0], 1);
        assertEquals(array_1[1], 2);
        assertEquals(array_1[2], 3);
        assertEquals(array_1[3], 4);
        assertEquals(array_1[4], 3);
        assertEquals(array_1[5], 2);
        assertEquals(array_1[6], 1);
    }
}