import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть послідовність чисел через пробіл: ");

        int input = scan.nextInt();

        int max = input;

        while (input != 0) {
            if (input > max) {
                max = input;
            }

            input = scan.nextInt();
        }

        System.out.println(max);
        scan.close();
    }
}