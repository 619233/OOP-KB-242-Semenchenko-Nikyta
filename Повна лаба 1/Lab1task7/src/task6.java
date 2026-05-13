import java.util.Scanner;

public class task6 {

    public static void main(String[] Restaurant) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть через пробіл загальну суму рахунку та кількість друзів: ");

        if (scan.hasNextDouble()) {
            double totalBill = scan.nextDouble();

            if (scan.hasNextInt()) {
                int friendsCount = scan.nextInt();


                if (totalBill <= 0) {
                    System.out.println("Помилка: сума має бути більша за 0");
                } else if (friendsCount <= 0) {
                    System.out.println("Помилка: друзів має бути більше 0");
                } else {
                    double totalWithTips = totalBill * 1.1;
                    double partToPay = totalWithTips / friendsCount;


                    System.out.printf("Кожен має заплатити: %.2f\n", partToPay);
                }
            }
            scan.close();
        }
    }
}