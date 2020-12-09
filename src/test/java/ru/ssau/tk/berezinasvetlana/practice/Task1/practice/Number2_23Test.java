package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_23;

import static org.testng.Assert.*;

public class Number2_23Test {

    @Test
    public void testSetArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Number2_23.setArray(array);
        assertEquals(array[0], 8);
        assertEquals(array[7], 1);
    }
}