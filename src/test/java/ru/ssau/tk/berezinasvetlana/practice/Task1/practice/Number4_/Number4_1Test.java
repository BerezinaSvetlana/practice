package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number4_;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.Person.Person;

import static org.testng.Assert.*;

public class Number4_1Test {

    @Test
    public void testGetObjectPerson() {

        Person p2 = new Person(null, null);
        Assert.assertThrows(NullPointerException.class, () -> Number4_1.getObjectPerson(p2));

    }
}