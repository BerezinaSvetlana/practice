package ru.ssau.tk.berezinasvetlana.practice.Task1.Person;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    Person_no_practice Berezina = new Person_no_practice("Svetlana",172, 70);
    Person_no_practice Abrosimova = new Person_no_practice("Margo",158, 44);

    @Test
    public void testGetName() {
        assertEquals(Berezina.name, "Svetlana");
        assertEquals(Abrosimova.name, "Margo");
    }

    @Test
    public void testGetHeight() {
        assertEquals(Berezina.height, 172.0);
        assertEquals(Abrosimova.height, 158.0);
    }

    @Test
    public void testGetWeight() {
        assertEquals(Berezina.weight, 70.0);
        assertEquals(Abrosimova.weight, 44.0);
    }

    @Test
    public void testSetName() {
        assertEquals(Berezina.name, "Svetlana");
        assertEquals(Abrosimova.name, "Margo");
    }

    @Test
    public void testSetHeight() {
        assertEquals(Berezina.name, "Svetlana");
        assertEquals(Abrosimova.name, "Margo");
    }

    @Test
    public void testSetWeight() {
        assertEquals(Berezina.name, "Svetlana");
        assertEquals(Abrosimova.name, "Margo");
    }
}