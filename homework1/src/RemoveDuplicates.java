import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] numbers = {7, 10, 11, 15, 2, 3, 3, 10, 11, 20};

        Integer[] reverseNumbers = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverseNumbers[i] = numbers[numbers.length - i - 1];
        }
        System.out.println(Arrays.toString(reverseNumbers) + "\n");

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(reverseNumbers));
        Integer[] withoutDuplicates = linkedHashSet.toArray(new Integer[] {});

        System.out.println(Arrays.toString(withoutDuplicates));
    }
}
