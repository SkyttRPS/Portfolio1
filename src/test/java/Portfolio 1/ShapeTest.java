import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Rectangle rect = new Rectangle(2.0, 1.0, 4.0,6.0);
    Circle circle = new Circle(6.0, 12.0, 4);
    Triangle triangle = new Triangle(4.0, 3.0, 3, 7,4);

    @Test
    void testGetArea() {
        // Rectangle test
        assertEquals(4.0 * 6.0, rect.getArea(), 0);
        System.out.println("Rectangle area is " + rect.getArea());

        // Circle test
        assertEquals(4, circle.getR(), 0 );
        System.out.println("Circle area is " + circle.getArea());

        // Triangle test
        double s = (3.0+7.0+4.0)/2;
        assertEquals(Math.sqrt(s * (s-3.0) * (s-7.0) * (s-4.0)), triangle.getArea());
        System.out.println("Triangle area is " + triangle.getArea());

    }

    @Test
    void testGetCircumference() {
        // Rectangle test
        assertEquals(2 * (4 + 6), rect.getCircumference());
        System.out.println("Rectangle circumference is " + rect.getCircumference());

        // Circle test
        assertEquals(2 * Math.PI * circle.getR(),circle.getCircumference());
        System.out.println("Circle circumference is " + circle.getCircumference());

        // Triangle test
        assertEquals(3+7+4, triangle.getCircumference());
        System.out.println("Triangle circumference is " + triangle.getCircumference());
    }

    @Test
    void testReturnCenter() {
        // Rectangle test


        // Circle test


        // Triangle test
    }

    @Test
    void testReturnDistance() {
        // Rectangle test


        // Circle test


        // Triangle test
    }
}