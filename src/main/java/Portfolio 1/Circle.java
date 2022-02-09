import java.awt.*;

class Circle extends Shape{
    private final float radius;

    // Circle constructor
    public Circle(float radius) {
        super();
        this.radius = radius;
    }

    public double getR() {
        return radius;
    }

    @Override
    // Method for calculating the area of a circle
    public float getArea() {
        float area;
        area = (float) (Math.PI * radius * radius);
        System.out.println("Area of the circle is: " + area + " cm^2");
        return area;
    }

    @Override
    // Method for calculating the circumference of a circle
    public float getCircumference() {
        float circumference;
        circumference = (float) (2 * Math.PI * radius);
        System.out.println("The circumference of the circle is: " + circumference + " cm");
        return circumference;
    }

    @Override
    // Method for calculating the center point of a circle
    public Point getCenter() {
        Point point = new Point();
        point.setLocation(radius, radius);
        System.out.println("The center point of the circle is: " + point);
        return point;
    }

    @Override
    // Method for catching if a point is inside the shape or not.
    public boolean isInside(float x, float y) {
        if(x >= 0 && x <= radius && y >= 0 && y <= radius ){
            System.out.println("The point is inside the circle");
            return true;
        } else {
            System.out.println("The point is outside the circle");
            return false;
        }
    }
}
