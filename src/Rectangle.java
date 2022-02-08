class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double x, double y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getCircumference() {
        return 2 * (height + width);
    }

    @Override
    public double returnCenter() {
        return 0;
    }

    @Override
    public double returnDistance() {
        return 0;
    }
}
