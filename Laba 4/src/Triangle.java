public class Triangle extends Figure {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException("Точки не можуть бути null");
        }
        this.a = a;
        this.b = b;
        this.c = c;

        // Перевірка на виродженість: якщо площа дорівнює нулю, трикутник не існує
        if (area() == 0) {
            throw new IllegalArgumentException("Трикутник вироджений (точки лежать на одній прямій)");
        }
    }

    @Override
    public double area() {
        // Формула площі за координатами вершин
        double s = (a.getX() * (b.getY() - c.getY()) +
                b.getX() * (c.getY() - a.getY()) +
                c.getX() * (a.getY() - b.getY())) / 2.0;
        return Math.abs(s);
    }

    @Override
    public Point centroid() {
        // Центроїд трикутника - середнє арифметичне його координат
        double cx = (a.getX() + b.getX() + c.getX()) / 3.0;
        double cy = (a.getY() + b.getY() + c.getY()) / 3.0;
        return new Point(cx, cy);
    }

    @Override
    public String toString() {
        return "Triangle[A" + a + " B" + b + " C" + c + "]";
    }
}