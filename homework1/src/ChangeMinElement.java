import java.util.Arrays;
import java.util.Collections;

public class ChangeMinElement {
    public static void main(String[] args) {
        Integer[] numbers = {7, 10, 11, 15, 3, 3, 12, 10, 11, 20};
        System.out.print("Original array: " + Arrays.toString(numbers));

        int min = Collections.min(Arrays.asList(numbers));
        System.out.println("\nFind min number of array: " + min);

        int total = 0;
        int minDuplicatesLength = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
            if (numbers[i] == min) {
                minDuplicatesLength++;
            }
        }

        int average = total / numbers.length;

        int minCounter = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                if (minDuplicatesLength == minCounter) {
                    numbers[i] = average;
                }
                minCounter++;
            }
        }

        System.out.print("Modified array: " + Arrays.toString(numbers));
    }
}
