import java.util.Arrays;

public class ReplaceElements {
    public static void main(String[] args) {
        Integer[] numbers = {7, 10, 11, 15, 2, 3, 3, 10, 11, 20};
        int listAverage = numbers.length / 2;

        for (int i = 0; i < listAverage; i++) {
            numbers[i] = numbers[i] + 2;
            System.out.println(numbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
