import java.util.Scanner;

public class task3 {

    final static int PASSWORD = 1500;

    public static void main(String[] password) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть пароль: ");

        while (scan.hasNextInt()) {

            int input = scan.nextInt();
            if (input == PASSWORD) {
                System.out.println("Hello, bro");
                break;
            } else {
                System.out.println("У доступі відмовлено");
                System.out.print("Спробуйте ще раз: ");
            }
        }
        scan.close();
    }
}