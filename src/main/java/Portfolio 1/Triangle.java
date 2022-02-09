import java.awt.*;

class Triangle extends Shape {
    public float x1, y1, x2, y2, x3, y3, side1, side2, side3;

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        super();
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public void getSides() {
        // We calculate the distance between each vertex with the following formula
        // distance(P,Q) = √(x2-x1)^2 + (y2-y1)^2
        // AB x1,y1 -> x2,y2
        this.side1 = Math.abs((float) Math.sqrt(Math.pow((x2-x1), 2) + Math.sqrt(Math.pow((y2-y1), 2))));
        // BC x2,y2 -> x3,y3
        this.side2 = Math.abs((float) Math.sqrt(Math.pow((x3-x2), 2) + Math.sqrt(Math.pow((y3-y2), 2))));
        // AC x1,y2 -> x3,y3
        this.side3 = Math.abs((float) Math.sqrt(Math.pow((x3-x1), 2) + Math.sqrt(Math.pow((y3-y1), 2))));
    }

    @Override
    public float getArea() {
        float area;
        float s = getCircumference()/2;
        area = (float) Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
        return area;
    }

    @Override
    public float getCircumference() {
        float circumference;
        getSides();
        circumference = this.side1+this.side2+this.side3;
        return circumference;
    }

    @Override
    public Point getCenter() {
        Point p = new Point();
        float centerX = (x1 + x2 + x3) / 3;
        float centerY = (y1 + y2 + y3) / 3;
        p.setLocation(centerX, centerY);
        return p;
    }

    @Override
    public boolean isInside(float x, float y) {
        return false;
    }
}
