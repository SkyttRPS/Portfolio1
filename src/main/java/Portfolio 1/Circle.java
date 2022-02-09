class Circle extends Shape{
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getR() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double returnCenter() {
        p.setX(x);
        p.setY(y);

        return getArea();
    }

    @Override
    public double returnDistance() {
        return 0;
    }
}
