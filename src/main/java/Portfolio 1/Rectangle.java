class Rectangle extends Shape {

    private final double height;
    private final double width;

    public Rectangle(double x, double y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getCircumference() {
        return 2 * (height + width);
    }

    @Override
    public double returnCenter() {
        p.setX(x+(width/2));
        p.setY(y+(height/2));
        return getArea();
    }

    @Override
    public double returnDistance() {
        return 0;
    }
}
