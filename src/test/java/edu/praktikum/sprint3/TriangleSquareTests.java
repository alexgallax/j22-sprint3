package edu.praktikum.sprint3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TriangleSquareTests {

    private final int side1;
    private final int side2;
    private final int side3;
    private final int expectedResult;

    @Parameterized.Parameters(name = "Triangle with sides [{0}, {1}, {2}] should have square {3}")
    public static Object[][] data() {
        return new Object[][] {
                { 2, 3, 4, 3 },
                { 3, 3, 4, 4 }
        };
    }

    public TriangleSquareTests(int side1, int side2, int side3, int expectedResult) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.expectedResult = expectedResult;
    }

    @Test
    public void squareTest() {
        Triangle triangle = new Triangle(side1, side2, side3);

        assertEquals("Square is incorrect", expectedResult, triangle.square());
    }
}
