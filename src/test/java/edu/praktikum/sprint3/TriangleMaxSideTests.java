package edu.praktikum.sprint3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TriangleMaxSideTests {

    @Test
    public void maxSideTest() {
        Triangle triangle = new Triangle(1, 2, 3);

        assertEquals("Perimeter is incorrect", 3, triangle.maxSide());
    }
}
