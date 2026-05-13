import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть коефіцієнти a, b та c:");

        if (scan.hasNextDouble()) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();

            double d = b * b - 4 * a * c;

            if (d > 0) {
                double x1 = (-b - Math.sqrt(d)) / (2 * a);
                double x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println(x1 + " " + x2);
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println(x);
            } else {
                System.out.println("no roots");
            }
        }
        scan.close();
    }
}