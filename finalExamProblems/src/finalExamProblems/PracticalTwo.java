package finalExamProblems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PracticalTwo {

    // Method to check if the file exists at the given path
    public static boolean doesFileExist(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            fileReader.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    // Method to read and print words and their meanings from the file
    public static void printDictionary(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" - ");
                if (parts.length == 2) {
                    String word = parts[0];
                    String[] meanings = parts[1].split(", ");
                    System.out.println(word);
                    for (String meaning : meanings) {
                        System.out.println("  " + meaning);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String path = "src/finalExamProblems/dictionary.txt"; // Assuming dictionary file is named "dictionary.txt"
        
        // Part a) Check if the file exists
        if (doesFileExist(path)) {
            System.out.println("File exists at path: " + path);
        } else {
            System.out.println("File does not exist at path: " + path);
            return; // Exit if file does not exist
        }
        
        // Part b) Read and print dictionary contents
        System.out.println("Dictionary Contents:");
        printDictionary(path);
    }
}
