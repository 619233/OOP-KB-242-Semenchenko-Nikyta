public class Main {
    public static void main(String[] args) {
        System.out.println("--- Тестування Лабораторної №4 ---");

        // 1. Тестуємо трикутник
        Figure triangle = new Triangle(new Point(0, 0), new Point(4, 0), new Point(0, 3));
        System.out.println(triangle.toString());
        System.out.println("Площа: " + triangle.area());
        System.out.println("Центроїд: " + triangle.centroid());
        System.out.println();

        // 2. Тестуємо коло
        Figure circle = new Circle(new Point(2, 2), 5.0);
        System.out.println(circle.toString());
        System.out.println("Площа: " + circle.area());
        System.out.println("Центроїд: " + circle.centroid());
        System.out.println();

        // 3. Тестуємо чотирикутник (квадрат для простоти перевірки)
        Figure quad = new Quadrilateral(new Point(0, 0), new Point(0, 4), new Point(4, 4), new Point(4, 0));
        System.out.println(quad.toString());
        System.out.println("Площа: " + quad.area());
        System.out.println("Центроїд: " + quad.centroid());
    }
}