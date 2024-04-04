package Week5;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read text from the user
        System.out.println("Enter text:");
        String text = sc.nextLine();

        // Count words using StringTokenizer
        int wordCount = countWords(text);

        // Count sentences
        int sentenceCount = countSentences(text);

        // Count occurrences of 'e' and 'z'
        int eCount = countOccurrences(text, 'e');
        int zCount = countOccurrences(text, 'z');

        // Output the results
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of sentences: " + sentenceCount);
        System.out.println("Number of 'e's: " + eCount);
        System.out.println("Number of 'z's: " + zCount);
        sc.close();
    }

    public static int countWords(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text);
        return tokenizer.countTokens();
    }

    public static int countSentences(String text) {
        // Sentences are considered to be terminated by '.', '!', or '?'
        StringTokenizer tokenizer = new StringTokenizer(text, ".!?");
        return tokenizer.countTokens();
    }

    public static int countOccurrences(String text, char target) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
