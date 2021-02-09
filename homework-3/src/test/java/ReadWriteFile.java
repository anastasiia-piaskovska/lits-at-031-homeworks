import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        String file = "/Users/nastyapiaskovska/projects/lits-at-031-homeworks/homework-3/src/text";
        String fileToWrite = "/Users/nastyapiaskovska/projects/lits-at-031-homeworks/homework-3/src/textWrite";

        ArrayList<String> list = readFileToArrayList(file);
        ArrayList<String> filteredList = filterFile(list);
        writeToArrayFile(fileToWrite, filteredList);
    }

    public static ArrayList<String> readFileToArrayList(String fileToRead) throws FileNotFoundException {
        File file = new File(fileToRead);

        ArrayList<String> list = new ArrayList<String>();
        Scanner in = new Scanner(file);


        while (in.hasNextLine()) {
            list.add(in.nextLine());
        }
        in.close();
        return list;
    }

    public static void writeToArrayFile(String fileToWrite, ArrayList<String> arrayListToWrite) throws IOException {
        FileWriter fw = new FileWriter(fileToWrite);

        BufferedWriter bw = new BufferedWriter(fw);
        for (String s : arrayListToWrite) {
            bw.write(s + "\n");
        }
        bw.close();
    }

    public static ArrayList<String> filterFile(ArrayList<String> arrayListFromFile) {
        ArrayList<String> data = new ArrayList<String>();

        for (int i = 1; i < arrayListFromFile.size(); i++) {
            if (i % 2 == 0) {
                data.add(arrayListFromFile.get(i - 1));
            }
        }

        return data;
    }
}
