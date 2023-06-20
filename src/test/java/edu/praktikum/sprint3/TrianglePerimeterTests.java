package edu.praktikum.sprint3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TrianglePerimeterTests {

    @Parameterized.Parameter
    public int side1;
    @Parameterized.Parameter(1)
    public int side2;
    @Parameterized.Parameter(2)
    public int side3;
    @Parameterized.Parameter(3)
    public int expectedResult;

    @Parameterized.Parameters(name = "Triangle with sides [{0}, {1}, {2}] should have perimeter {3}")
    public static Object[][] data() {
        return new Object[][] {
                { 1, 2, 3, 6 },
                { 2, 2, 3, 7 }
        };
    }

    @Test
    public void perimeterTest() {
        Triangle triangle = new Triangle(side1, side2, side3);

        assertEquals("Perimeter is incorrect", expectedResult, triangle.perimeter());
    }
}
