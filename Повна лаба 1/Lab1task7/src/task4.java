import java.util.Scanner;

public class task4 {

    public static void main(String[] Customers) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Скільки людей прийде? ");

        if (scan.hasNextInt()) {
            int count = scan.nextInt();
            scan.nextLine();

            if (count < 0) {
                System.out.println("Помилка: кількість не може бути від'ємною");
            } else if (count == 0) {
                System.out.println("Cхоже, сьогодні ми нікого не чекаємо");
            } else {
                for (int i = 0; i < count; i++) {
                    System.out.print("Введіть ім'я " + (i + 1) + "-го незнайомця: ");
                    String name = scan.nextLine();
                    System.out.println("Hello, " + name);
                }
            }
        } else{
            System.out.println("Це не число!");
        }
        scan.close();
    }
}