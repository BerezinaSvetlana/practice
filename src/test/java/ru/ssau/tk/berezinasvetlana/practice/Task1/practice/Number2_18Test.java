package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_18;

import static org.testng.Assert.*;

public class Number2_18Test {

    @Test
    public void testMaxvalue() {
        int[] array = new int[]{121, 43, 81, 22, 6};
        assertNull(Number2_18.Maxvalue(new int[]{}), null);
    }
}