import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть послідовність чисел через пробіл: ");

        int sum = 0;
        int count = 0;

        int input = scan.nextInt();

        while (input != 0) {
            sum += input;
            count++;

            input = scan.nextInt();
        }

        if (count > 0) {
            int result = sum / count;
            System.out.println("Середнє значення: " + result);
        } else {
            System.out.println("Послідовність порожня");
        }
        scan.close();
    }
}