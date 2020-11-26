import java.util.Arrays;

public class ReplaceElements {
    public static void main(String[] args) {
        Integer[] numbers = {7, 10, 11, 15, 2, 3, 3, 10, 11, 20};
        int numbers_length = numbers.length / 2;

        for (int position = 0; position < numbers_length; position++) {
            numbers[position] = numbers[position] + 2;
            System.out.println(numbers[position]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
