/*
 *  A class Shape that holds the abstract methods and one shared method
 */

import java.awt.*;

public abstract class Shape {

    abstract float getArea(); // Abstract method for calculating area of a shape
    abstract float getCircumference(); // Abstract method for calculating the circumference of a shape
    abstract Point getCenter(); // Abstract method getting the shape center
    abstract boolean isInside(float x, float y); // Abstract method for checking if a point is inside a shape

    /*
     * As all shapes have a center given by a point (x,y)
     * they share the same method for calculate euclidean distance.
     */
    public float getDistance(Shape other) {
        float distance;
        Point c1 = this.getCenter();
        Point c2 = other.getCenter();
        float x1 = (float) c1.getX();
        float y1 = (float) c1.getY();
        float x2 = (float) c2.getX();
        float y2 = (float) c2.getY();
        distance = (float) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

        System.out.println("The Euclidean distance between the shapes is: " + distance + "\n");
        return distance;
    }

}
