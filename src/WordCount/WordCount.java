package WordCount;

import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws Exception {
        File file = new File("98.rtf");
        Scanner scanner = new Scanner(file);
        int word = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            word += line.split(" ").length;
        }
        System.out.println("The file contains: " + word + " words");

    }
}
