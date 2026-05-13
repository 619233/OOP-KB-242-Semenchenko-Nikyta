public class Line {
    private double k;
    private double b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (this.k == other.k) {
            return null;
        }

        double x = (other.b - this.b) / (this.k - other.k);
        double y = this.k * x + this.b;

        return new Point(x, y);
    }
}