public class Circle extends Figure {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        // Перевірка на виродженість (радіус має бути більшим за 0)
        if (center == null || radius <= 0) {
            throw new IllegalArgumentException("Коло вироджене або некоректні дані");
        }
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Point centroid() {
        return center;
    }

    @Override
    public String toString() {
        return "Circle[" + center.toString() + " " + radius + "]";
    }
}