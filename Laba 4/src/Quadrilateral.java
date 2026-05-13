public class Quadrilateral extends Figure {
    private Point a, b, c, d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        if (a == null || b == null || c == null || d == null) {
            throw new IllegalArgumentException("Точки не можуть бути null");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        // Перевірка на виродженість (площа не може бути нульовою)
        if (area() == 0) {
            throw new IllegalArgumentException("Чотирикутник вироджений");
        }
    }

    @Override
    public double area() {
        // Формула площі багатокутника (формула Гауса / шнурків)
        double s = 0.5 * Math.abs(
                a.getX() * b.getY() - b.getX() * a.getY() +
                        b.getX() * c.getY() - c.getX() * b.getY() +
                        c.getX() * d.getY() - d.getX() * c.getY() +
                        d.getX() * a.getY() - a.getX() * d.getY()
        );
        return s;
    }

    @Override
    public Point centroid() {
        // Центроїд площі чотирикутника:
        // розбиваємо на два трикутники і знаходимо зважене середнє їх центроїдів
        Triangle t1 = new Triangle(a, b, c);
        Triangle t2 = new Triangle(a, c, d);

        double area1 = t1.area();
        double area2 = t2.area();

        Point c1 = t1.centroid();
        Point c2 = t2.centroid();

        double cx = (c1.getX() * area1 + c2.getX() * area2) / (area1 + area2);
        double cy = (c1.getY() * area1 + c2.getY() * area2) / (area1 + area2);

        return new Point(cx, cy);
    }

    @Override
    public String toString() {
        return "Quadrilateral[A" + a + " B" + b + " C" + c + " D" + d + "]";
    }
}