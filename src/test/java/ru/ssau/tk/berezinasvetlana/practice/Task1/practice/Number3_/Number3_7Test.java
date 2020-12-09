package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number3_7Test {

    @Test
    public void testIndexStr() {
        assertEquals(Number3_7.indexStr("abcabcabc", "ca"), 2);
        assertEquals(Number3_7.indexStr("oop", "p"), 2);
        assertEquals(Number3_7.indexStr("Abracadabra", "da"), 6);
        assertEquals(Number3_7.indexStr("berezina", "svetlana"), -1);
    }
}