/*
 *  A class Shape that holds the x and y positions of any shape.
 *  The class implements the ShapeMethods interface.
 */

public abstract class Shape implements ShapeMethods{
    private double xPos; // To hold the x position of the shape
    private double yPos; // TO hold the y position of the shape

    public Shape(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
}
