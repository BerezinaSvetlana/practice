package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number3_12Test {

    @Test
    public void testStrings() {
        assertEquals(new Number3_12().Strings("opopopopo", "opo", "po"), "popppo");
        assertEquals(new Number3_12().Strings("abcabcbabc", "abc", "ac"), "acacbac");
        assertEquals(new Number3_12().Strings("zzscgvjgf", "zjsvh", "zndfgjeyf"), "zzscgvjgf");
        assertNotEquals(new Number3_12().Strings("abcabcbabc", "abc", "ac"), "abc");
    }
}