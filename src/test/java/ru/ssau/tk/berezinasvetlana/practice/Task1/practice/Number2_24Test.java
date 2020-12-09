package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number2_24Test {

    @Test
    public void testGetArray() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        Number2_24.setArray(array);
        assertEquals(array[0], -2);
        Number2_24.setArray(array);
        assertEquals(array[0], 1);
    }
}