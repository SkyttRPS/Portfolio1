/*
 *  A class Shape that holds the x and y positions of any shape.
 *  The class implements the ShapeMethods interface.
 */

public abstract class Shape implements ShapeMethods{
    private double x; // To hold the x position of the shape
    private double y; // TO hold the y position of the shape

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
