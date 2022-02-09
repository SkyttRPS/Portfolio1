import java.util.Objects;
import java.util.Scanner;

/*
 * In the main method we want to generate some shapes and try out our methods.
 *
 * Functionality features the following methods
 * 1. getArea(); for calculating the are of a shape
 * 2. getCircumference(); for calculating the shape perimeter
 * 3. getCenter(); for getting the center coordinates of a shape
 * 4. isInside(); for telling if a point is inside or outside of a shape
 */

public class Portfolio1 {

    public static void main(String[] args) {
        // Create an array of six Shape objects
        Shape[] shapes = new Shape[6];

        // Assigning six shapes with values to try the methods on
        shapes[0] = new Rectangle(12, 4);
        shapes[1] = new Rectangle(18, 7);
        shapes[2] = new Circle(13);
        shapes[3] = new Circle(4);
        shapes[4] = new Triangle(12, 7, 3, -7, 4, -12);
        shapes[5] = new Triangle(3, 5, 5, -3, 2, 0);

        // Loops through the shapes array and call each method
        for (int i=0; i<shapes.length; i++) {
            System.out.println("Shape index " + i + ": ");
            shapes[i].getArea();
            shapes[i].getCircumference();
            shapes[i].getCenter();
            shapes[i].isInside(8, 3); // the x and y can be represented by any floating point value
            System.out.println();
        }

    }
}
