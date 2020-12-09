package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_26;

import static org.testng.Assert.*;

public class Number2_26Test {

    @Test
    public void testSum_Array() {
        int[] array = new int[]{2, 3, 6, 9, 8, 100, 222};
        int[] array_1 = new int[]{13, 4, 28, 32, 102, 101};
        assertEquals(Number2_26.Sum_Array(array), new int[]{5, 15, 108, 222});
        assertEquals(Number2_26.Sum_Array(array_1), new int[]{17, 60, 203});
        assertEquals(Number2_26.Sum_Array(new int[]{10, 4, 8, 2, 9}), new int[]{14, 10, 9});
        assertEquals(Number2_26.Sum_Array(new int[]{10, 4, 8, 2, 9, 1, 2, 5}), new int[]{14, 10, 10, 7});

    }
}