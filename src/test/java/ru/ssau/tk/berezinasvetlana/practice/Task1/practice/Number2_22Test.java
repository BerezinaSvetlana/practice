package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_22;

import static org.testng.Assert.*;

public class Number2_22Test {

    @Test
    public void testGetIndexOftenNumber() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(Number2_22.getIndexOftenNumber(array, 1), 0);
        assertEquals(Number2_22.getIndexOftenNumber(array, 3), 2);
        assertEquals(Number2_22.getIndexOftenNumber(array, 7), 6);
    }
}