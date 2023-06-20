package edu.praktikum.sprint3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleMaxSideTests {

    @Test
    public void maxSideTest() {
        Triangle triangle = new Triangle(1, 2, 3);

        assertEquals("Max side is incorrect", 3, triangle.maxSide());
    }
}
