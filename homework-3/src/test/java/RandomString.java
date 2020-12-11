import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        String[] stringsList = {"Hello World", "Have a great day", "Angel", "Random String", "Word Game"};
        List<String> filteredStringList = new ArrayList<String>();


        for(Integer i = 0; i < stringsList.length; i++) {
            String item = stringsList[i];
            Integer itemLength = item.length();

            if (6 <= itemLength && itemLength <= 15) {
                filteredStringList.add(item);
            }
        }

        generateRandomString(filteredStringList);
    }

    static String generateRandomString(List<String> list) {
        Random randomList = new Random();
        Integer filteredStringListItem = randomList.nextInt(list.size());
        String randomElement = list.get(filteredStringListItem);

        System.out.println(randomElement);
        return randomElement;
    }
}
