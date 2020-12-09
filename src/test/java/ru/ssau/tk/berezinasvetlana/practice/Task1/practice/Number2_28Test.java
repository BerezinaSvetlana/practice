package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_28;

import static org.testng.Assert.*;

public class Number2_28Test {

    @Test
    public void testLongToInt() {
        assertEquals(Number2_28.intToLong(Number2_28.longToInt(1095L)), 1095L);
        assertEquals(Number2_28.intToLong(Number2_28.longToInt(9L)), 9L);
    }

}