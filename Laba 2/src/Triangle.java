public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (area() == 0) {
            throw new IllegalArgumentException("Трикутник вироджений");
        }
    }

    public double area() {
        double s = (a.getX() * (b.getY() - c.getY()) +
                b.getX() * (c.getY() - a.getY()) +
                c.getX() * (a.getY() - b.getY())) / 2.0;
        return Math.abs(s);
    }

    public Point centroid() {
        double xc = (a.getX() + b.getX() + c.getX()) / 3.0;
        double yc = (a.getY() + b.getY() + c.getY()) / 3.0;
        return new Point(xc, yc);
    }
}