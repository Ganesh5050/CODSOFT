import java.util.Scanner;

public class WORDCOUNTER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi Welcome To GANESH Word Counter"); // Displaying the Message for Word Counter
        System.out.print("Please Enter a sentence or paragraph: ");

        String input = scanner.nextLine(); // take input string from user

        String[] words = splitIntoWords(input); // Step 3: Split the string into an array of words
        int wordCount = countWords(words); // Step 4: Initialize a counter variable to keep track of the number of words

        System.out.println("Total word count in the given input Sentence / Paragraph: " + wordCount);

        scanner.close();
    }

    // Step 3: Split the string into an array of words
    public static String[] splitIntoWords(String text) {
        if (text == null || text.isEmpty()) {
            return new String[0];
        }

        // Split the string using space or punctuation as delimiters
        return text.split("[\\s\\p{Punct}]+");
    }

    // Step 4 & 5: Initialize a counter variable to keep track of the number of
    // words
    // Iterate through the array of words and increment the counter for each word
    // encountered
    public static int countWords(String[] words) {
        return words.length;
    }
}
