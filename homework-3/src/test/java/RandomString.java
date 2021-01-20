import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        String randomStringsList = generateRandomString(listFiltered());
        System.out.println(randomStringsList);
    }

    static List<String> listFiltered() {
        String[] stringsList = {"Hello World", "Have a great day", "Angel", "Random String", "Word Game"};
        List<String> filteredStringList = new ArrayList<>();

        for (String item : stringsList) {
            int itemLength = item.length();

            if (6 <= itemLength && itemLength <= 15) {
                filteredStringList.add(item);
            }
        }
        return filteredStringList;
    }

    static String generateRandomString(List<String> list) {
        Random random = new Random();
        int filteredStringListItem = random.nextInt(list.size());

        return list.get(filteredStringListItem);
    }
}
