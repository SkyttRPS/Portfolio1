import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    // Creating one of each shape object to test shared methods on
    Rectangle rect = new Rectangle(6, 4);
    Circle circle = new Circle(4);
    Triangle triangle = new Triangle(1,2, 3, -4, 6,-7);

    @Test
    void testGetArea() {
        System.out.println("Areas:");
        // Rectangle test
        float rTest = 4 * 6;
        assertEquals(rTest, rect.getArea());
        System.out.println("Rectangle area is " + rect.getArea());

        // Circle test
        float cTest = 4;
        assertEquals(cTest, circle.getR());
        System.out.println("Circle area is " + circle.getArea());

        // Triangle test
        triangle.getSides();
        float s = (triangle.side1 + triangle.side2 + triangle.side3)/2;
        float tTest = (float) Math.sqrt(s*(s-triangle.side1)*(s-triangle.side2)*(s-triangle.side3));
        assertEquals(tTest, triangle.getArea());
        System.out.println("Triangle area is " + triangle.getArea());
        System.out.println();
    }

    @Test
    void testGetCircumference() {
        System.out.println("Circumferences:");
        // Rectangle test
        float rTest = 2 * (4 + 6);
        assertEquals(rTest, rect.getCircumference());
        System.out.println("Rectangle circumference is " + rect.getCircumference());

        // Circle test
        float cTest = (float) (2 * Math.PI * circle.getR());
        assertEquals(cTest,circle.getCircumference());
        System.out.println("Circle circumference is " + circle.getCircumference());

        // Triangle test
        triangle.getSides();
        float tTest = triangle.side1 + triangle.side2 + triangle.side3;
        assertEquals(tTest, triangle.getCircumference());
        System.out.println("Triangle circumference is " + triangle.getCircumference());
        System.out.println();
    }

    @Test
    void testReturnCenter() {
        System.out.println("Center points:");
        // Rectangle test
        Point rTest = new Point(3,2);
        assertEquals(rTest, rect.getCenter());
        System.out.println("Rectangle center: " + rect.getCenter());

        // Circle test
        Point cTest = new Point(4,4);
        assertEquals(cTest, circle.getCenter());
        System.out.println("Circle center: " + circle.getCenter());

        Point tTest = new Point(3,-3);
        assertEquals(tTest, triangle.getCenter());
        // Triangle test
        System.out.println("Triangle center: " + triangle.getCenter());
        System.out.println();
    }

    @Test
    void testReturnDistance() {
        System.out.println("Distance test:");
        rect.getDistance(circle);
        System.out.println();
    }
}