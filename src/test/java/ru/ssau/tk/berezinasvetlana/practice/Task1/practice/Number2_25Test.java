package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_25;

import static org.testng.Assert.*;

public class Number2_25Test {

    @Test
    public void testSetArray() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] arrayNot = Number2_25.setArray(array);
        assertEquals(arrayNot[0], -2);
        assertEquals(array[0], 1);
    }
}