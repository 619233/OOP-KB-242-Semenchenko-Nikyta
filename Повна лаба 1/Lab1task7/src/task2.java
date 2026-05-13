import java.util.Scanner;

public class task2 {
    public static void main(String[] timeDani) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть кількість секунд: ");
        while (scan.hasNextInt()) {

            int totalSeconds = scan.nextInt();

            int secondsInDay = totalSeconds % 86400;
            int hours = secondsInDay / 3600;
            int minutes = (secondsInDay % 3600) / 60;
            int seconds = secondsInDay % 60;

            System.out.printf("%d:%02d:%02d\n", hours, minutes, seconds);
            System.out.print("Введіть наступне значення секунд: ");
        }
        scan.close();
    }
}