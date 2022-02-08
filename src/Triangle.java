class Triangle extends Shape {
    public double a, b, c;

    public Triangle(double x, double y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    // Using herons formula where s is the semiperimeter given as s = (a+b+c)/2
    public double getArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    @Override
    public double getCircumference() {
        return a + b + c;
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
