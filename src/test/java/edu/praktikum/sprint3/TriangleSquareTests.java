package edu.praktikum.sprint3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TriangleSquareTests {

    @Test
    public void squareTest() {
        Triangle triangle = new Triangle(2, 3, 4);

        assertEquals("Square is incorrect", 3, triangle.square());
    }
}
