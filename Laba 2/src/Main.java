import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Завдання 1: Прямі ---");
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);
        System.out.println("Точка перетину: " + line1.intersection(line2));

        System.out.println("--- Завдання 2: Відрізки ---");
        Segment seg1 = new Segment(new Point(0, 0), new Point(4, 4));
        Segment seg2 = new Segment(new Point(0, 4), new Point(4, 0));
        System.out.println("Довжина відрізка: " + seg1.length());
        System.out.println("Середина відрізка: " + seg1.middle());
        System.out.println("Перетин відрізків: " + seg1.intersection(seg2));

        System.out.println("--- Завдання 3: Трикутник ---");
        Triangle tr = new Triangle(new Point(0, 0), new Point(4, 0), new Point(0, 3));
        System.out.println("Площа: " + tr.area());
        System.out.println("Центроїд: " + tr.centroid());

        scan.close();
    }
}