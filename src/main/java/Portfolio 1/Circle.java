import java.awt.*;

class Circle extends Shape{
    private final float radius;

    public Circle(float radius) {
        super();
        this.radius = radius;
    }

    public double getR() {
        return radius;
    }

    @Override
    public float getArea() {
        float area;
        area = (float) (Math.PI * radius * radius);
        return area;
    }

    @Override
    public float getCircumference() {
        float circumference;
        circumference = (float) (2 * Math.PI * radius);
        return circumference;
    }

    @Override
    public Point getCenter() {
        Point p = new Point();
        p.setLocation(radius, radius);
        return p;
    }

    @Override
    public boolean isInside(float x, float y) {
        if(x >= 0 && x <= radius && y >= 0 && y <= radius ){
            System.out.println("The point is inside the shape");
            return true;
        } else {
            System.out.println("The point is outside the shape");
            return false;
        }
    }
}
