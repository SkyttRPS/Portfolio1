import java.awt.*;

class Rectangle extends Shape {

    float x1, y1, centerX, centerY; //

    public Rectangle(float x1, float y1) {
        super();
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public float getArea() {
        float area;
        area = this.x1 * this.y1;
        return area;
    }

    @Override
    public float getCircumference() {
        float circumference;
        circumference = 2 * (x1 + y1);
        return circumference;
    }

    @Override
    public Point getCenter() {
        Point point = new Point();
        this.centerX = x1/2;
        this.centerY = y1/2;
        point.setLocation(centerX, centerY);
        return point;
    }

    @Override
    public boolean isInside(float x, float y) {
        if(x >= 0 && x <= x1 && y >= 0 && y <= y1 ){
            System.out.println("The point is inside the shape");
            return true;
        } else {
            System.out.println("The point is outside the shape");
            return false;
        }
    }
}
