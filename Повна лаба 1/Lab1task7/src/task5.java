import java.util.Scanner;

public class task5 {

    public static void main(String[] Math) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть через пробіл підйом (a), спуск (b) та висоту (h): ");

        if (scan.hasNextInt()) {
            int a = scan.nextInt(); // підйом за день
            int b = scan.nextInt(); // спуск за ніч
            int h = scan.nextInt(); // висота дерева

            if (a <= b && a < h) {
                System.out.println("Impossible");
            } else {
                int currentHeight = 0;
                int days = 0;

                while (true) {
                    days++;
                    currentHeight += a;

                    if (currentHeight >= h) {
                        break;
                    }

                    currentHeight -= b;
                }

                System.out.println(days);
            }
        }
        scan.close();
    }
}