import java.awt.*;

class Triangle extends Shape {
    public float x1, y1, x2, y2, x3, y3, side1, side2, side3;

    // Triangle Constructor
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
    // Method for calculating the area of a Triangle
    public float getArea() {
        float area = (float) Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
        System.out.println("Area of the triangle is: " + area + " cm^2");
        return area;
    }

    @Override
    // Method for calculating the circumference of a Triangle
    public float getCircumference() {
        float circumference;
        getSides();
        circumference = this.side1+this.side2+this.side3;
        System.out.println("The circumference of the triangle is: " + circumference + " cm");
        return circumference;
    }

    @Override
    // Method for calculating the center point of a Triangle
    public Point getCenter() {
        Point point = new Point();
        float centerX = (x1 + x2 + x3) / 3;
        float centerY = (y1 + y2 + y3) / 3;
        point.setLocation(centerX, centerY);
        System.out.println("The center point of the triangle is: " + point);
        return point;
    }

    @Override
    // Method for catching if a point is inside the shape or not.
    public boolean isInside(float x, float y) {
        float area1 = Math.abs (x1 * (y2 - y3) + x2 * (y3 - x1) + x3 * (y1 - y2));
        float area2 = Math.abs (x1 * (y2 - y) + x2 * (y - x1) + x * (y1 - y2));
        float area3 = Math.abs (x1 * (y - y3) + x * (y3 - x1) + x3 * (y1 - y));
        float area4 = Math.abs (x1 * (y2 - y3) + x2 * (y3 - y) + x3 * (y1 - y2));

        if(area1 == area2 + area3 + area4) {
            System.out.println("This point is inside the triangle");
            return true;
        } else {
            System.out.println("This point is outside the triangle");
            return false;
        }
    }
}
