import java.awt.*;

class Rectangle extends Shape {

    float x1, y1, centerX, centerY; //

    // Rectangle constructor
    public Rectangle(float x1, float y1) {
        super();
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    // Method for calculating the area of a rectangle
    public float getArea() {
        float area;
        area = this.x1 * this.y1;
        System.out.println("Area of the rectangle is: " + area + " cm^2");
        return area;
    }

    @Override
    // Method for calculating the circumference of a rectangle
    public float getCircumference() {
        float circumference;
        circumference = 2 * (x1 + y1);
        System.out.println("The circumference of the rectangle is: " + circumference + " cm");
        return circumference;
    }

    @Override
    // Method for calculating the center point of a rectangle
    public Point getCenter() {
        Point point = new Point();
        this.centerX = x1/2;
        this.centerY = y1/2;
        point.setLocation(centerX, centerY);
        System.out.println("The center point of the rectangle is: " + point);
        return point;
    }

    @Override
    // Method for catching if a point is inside the shape or not.
    public boolean isInside(float x, float y) {
        if(x >= 0 && x <= x1 && y >= 0 && y <= y1 ){
            System.out.println("The point is inside the Rectangle");
            return true;
        } else {
            System.out.println("The point is outside the Rectangle");
            return false;
        }
    }
}
