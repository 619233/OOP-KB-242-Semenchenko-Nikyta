public class task11 {
    public static void main(String[] args) {
        int[] numbers = {5, -2, 10, 8, 3};

        System.out.println("Сума парних чисел у масиві: " + sum(numbers));
    }

    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int sumValue = 0;

        for (int i = 0; i < array.length; i++) {

        if (array[i] % 2 == 0) {
            sumValue += array[i];
            }
        }

        return sumValue;
    }
}