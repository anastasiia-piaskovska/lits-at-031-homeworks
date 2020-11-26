import java.util.Arrays;
import java.util.Collections;

public class ChangeMinElement {
    public static void main(String[] args) {
        Integer[] numbers = {7, 10, 11, 15, 3, 3, 12, 10, 11, 20};
        System.out.print("Original array: " + Arrays.toString(numbers));

        int min = Collections.min(Arrays.asList(numbers));
        System.out.println("\nFind min number of array: " + min);

        int total = 0;
        int min_duplicates_length = 0;
        for (int position = 0; position < numbers.length; position++) {
            total += numbers[position];
            if (numbers[position] == min) {
                min_duplicates_length += 1;
            }
        }

        int average = total / numbers.length;

        int min_counter = 1;
        for (int position = 0; position < numbers.length; position++) {
            if (min == numbers[position]) {
                if (min_duplicates_length == min_counter) {
                    numbers[position] = average;
                }
                min_counter += 1;
            }
        }

        System.out.print("Modified array: " + Arrays.toString(numbers));
    }
}
