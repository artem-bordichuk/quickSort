import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        final int BOUND = 50;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(BOUND);
        }

        System.out.println("Before quick sorting:");
        System.out.println(Arrays.toString(numbers));

        QuickSort.quickSort(numbers);

        System.out.println("After quick sorting:");
        System.out.println(Arrays.toString(numbers));
    }
}
