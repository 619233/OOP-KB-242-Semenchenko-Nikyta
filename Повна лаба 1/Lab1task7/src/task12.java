public class task12 {
    public static void main(String[] args) {
        int[] input = {1, -1, 0, 4, 6, 10, 15, 25};
        boolean[] result = getSumCheckArray(input);

        for (boolean b : result) {
            System.out.print(b + " ");
        }
    }

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] results = new boolean[array.length];

        results[0] = false;
        results[1] = false;

        for (int i = 2; i < array.length; i++) {
            if (array[i] == array[i - 1] + array[i - 2]) {
                results[i] = true;
            } else {
                results[i] = false;
            }
        }

        return results;
    }
}