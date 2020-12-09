package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_27;

import static org.testng.Assert.*;

public class Number2_27Test {

    @Test
    public void testSetArray() {
        int[] array = new int[]{2, 3, 6, 9, 8, 100, 222};
        int[] array_1 = new int[]{13, 4, 28, 32, 102, 101};
        assertEquals(Number2_27.setArray(array), new boolean[]{true, false, true, false, true, true, true});
        assertEquals(Number2_27.setArray(array_1), new boolean[]{false, true, true, true, true, false});
    }
}