import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        int[] numbers = {5, -2, 10, 8, 3};

        System.out.println("Максимум у масиві: " + max(numbers));
    }

    public static int max(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }
}