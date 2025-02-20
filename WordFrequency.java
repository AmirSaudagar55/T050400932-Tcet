import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        
        
        String input = scanner.nextLine();
        scanner.close();
        
        // Converting the string to lowercase so that the count is case-insensitive
        input = input.toLowerCase();
        
        // Removing punctuation using a regular expression (keeps only letters and spaces)
        input = input.replaceAll("[^a-z\\s]", "");
        
        // Spliting the string into words using whitespace as the delimiter
        String[] words = input.split("\\s+");
        
        // Creating a HashMap to store the frequency of each word
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Looping through the array of words and count the frequency
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                // Increasing the count if the word is already in the map
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // Adding the word with a count of 1 if it is not in the map yet
                wordCount.put(word, 1);
            }
        }
        
    
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
