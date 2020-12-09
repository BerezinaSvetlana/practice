package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number3_8Test {

    @Test
    public void testIndexOf() {
        assertEquals(Number3_8.indexOf("abcabcabc", "ca"), 5);
        assertEquals(Number3_8.indexOf("oop", "p"), 2);
        assertEquals(Number3_8.indexOf("Abracadabra", "da"), 6);
        assertEquals(Number3_8.indexOf("berezina", "svetlana"), -1);
    }
}