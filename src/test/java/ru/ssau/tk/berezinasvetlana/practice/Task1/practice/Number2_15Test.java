package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_15;

import static org.testng.Assert.*;

public class Number2_15Test {

    @Test
    public void testSetArray() {
        int[] arr = {1, 2, 3};
        int[] arr_1 = {0, 7, 21};
        assertEquals(Number2_15.setArray(arr, 3), true);
        assertEquals(Number2_15.setArray(arr, -1), false);
        assertNotEquals(Number2_15.setArray(arr_1, 3), true);
        assertEquals(Number2_15.setArray(arr_1, -1), false);
    }
}