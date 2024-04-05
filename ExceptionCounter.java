package Week6;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExceptionCounter {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\91956\\Desktop\\Lab Weeks Solutions Sem2\\Week6\\FileDataProcessorApp.java"; // Replace with the actual file path
        try {
            int exceptionCount = countExceptions(filePath);
            System.out.println("Total number of exceptions found: " + exceptionCount);
        } catch (IOException e) {
            System.err.println("An error occurred while processing the file: " + e.getMessage());
        }
    }

    public static int countExceptions(String filePath) throws IOException {
        if (!Files.exists(Paths.get(filePath))) {
            throw new IOException("File not found: " + filePath);
        }

        String[] exceptionKeywords = {"try", "catch", "finally", "throw", "throws"};
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String keyword : exceptionKeywords) {
                    // This checks if the keyword exists in a line. Note: This can be improved to avoid false positives.
                    if (line.contains(keyword)) {
                        count++;
                        break; // Avoid counting multiple keywords in the same line
                    }
                }
            }
        }

        return count;
    }
}

