package ru.ssau.tk.berezinasvetlana.practice.Task1.Point;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.berezinasvetlana.practice.Task1.Point.Points.equalsApproximately;

public class PointsTest {
    @Test
    public void testsSum() {
        assertTrue(equalsApproximately(Points.sum(new Point(1.0, 1.0, 1.0),
                new Point(2.0, 2.0, 2.0)),
                new Point(3.0, 3.0, 3.0)));
    }

    @Test
    public void testSubtract() {
        assertTrue(equalsApproximately(Points.subtract(new Point(5, 5, 5),
                new Point(4, 4, 4)),
                new Point(1, 1, 1)));
    }

    @Test
    public void testMultiply() {
        assertTrue(equalsApproximately(Points.multiply(new Point(1, 1, 1),
                new Point(5, 5, 5)),
                new Point(5, 5, 5)));
    }

    @Test
    public void testDevide() {
        assertTrue(equalsApproximately(Points.devide(new Point(6, 6, 6),
                new Point(2, 2, 2)),
                new Point(3, 3, 3)));
    }

    @Test
    public void testEnlarge() {
        assertTrue(equalsApproximately(Points.enlarge(new Point(1, 1, 1),
                3), new Point(3, 3, 3)));
    }

    @Test
    public void testLength() {
        assertEquals(Points.length(new Point(1.0, 1.0, 1.0)), Math.sqrt(3), 0.00005);
    }

    @Test
    public void testOpposite() {
        assertTrue(equalsApproximately(Points.opposite(new Point(1.0, 1.5, -0.5)), new Point(-1.0, -1.5, 0.5)));
    }

    @Test
    public void testInverse() {
        assertFalse(equalsApproximately(Points.inverse(new Point(1.0, 1.5, 0.5)), new Point(6.0, 0.66666, 2.0)));
    }

    @Test
    public void testScalarProduct() {
        assertEquals(Points.scalarProduct(new Point(1.0, 0.5, 2.0), new Point(3.0, -0.5, 4.0)), 10.75, 0.00005);
    }

    @Test
    public void testVectorProduct() {
        assertTrue(equalsApproximately(Points.vectorProduct(new Point(3.0, 2.0, 1.0), new Point(-1.0, 4.0, 5.0)), new Point(6.0, -16.0, 14.0)));
    }

}