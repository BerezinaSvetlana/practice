package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_14;

import static org.testng.Assert.*;

public class Number2_14Test {

    @Test
    public void testSetArray() {
        int array_1[] = new int[]{1, 2,-3};
        int array_2[] = new int[]{5, 0,-7};
        Number2_14.setArray(array_1);
        assertEquals((array_1[0]), -1);
        assertEquals((array_1[1]), -2);
        assertEquals(array_1[2],3);
        Number2_14.setArray(array_2);
        assertEquals((array_2[0]), -5);
        assertEquals((array_2[1]), 0);
        assertEquals(array_2[2],7);
    }
}