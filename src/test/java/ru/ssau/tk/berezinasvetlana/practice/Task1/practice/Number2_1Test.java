package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_1;

import static org.testng.Assert.*;

public class Number2_1Test {

    @Test
    public void testNumber() {
        int[] array_1 = Number2_1.Number(1);
        int[] array_2 = Number2_1.Number(3);
        int[] array_3 = Number2_1.Number(7);
        int[] array_4 = Number2_1.Number(4);
        int[] array_5 = Number2_1.Number(9);
        int[] array_6 = Number2_1.Number(10000);
        int[] array_7 = Number2_1.Number(111);
        assertEquals(array_1.length, 1);
        assertEquals(array_2.length, 3);
        assertEquals(array_3.length, 7);
        assertEquals(array_4.length, 4);
        assertNotEquals(array_5.length, 1);
        assertNotEquals(array_6.length, 1);
        assertNotEquals(array_7.length, 1);
    }
}
