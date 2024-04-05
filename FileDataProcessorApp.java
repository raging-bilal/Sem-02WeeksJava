package Week6;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDataProcessorApp {

    // Custom Exception Class
    public static class InvalidDataException extends Exception {
        public InvalidDataException(String message) {
            super(message);
        }
    }

    // DataProcessor Class
    public static class DataProcessor {
        public List<Double> readValuesFromFile(String filePath) throws FileNotFoundException, IOException, InvalidDataException {
            List<Double> values = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    try {
                        double value = Double.parseDouble(line.trim());
                        values.add(value);
                    } catch (NumberFormatException e) {
                        // If a line is not a valid double, throw a custom exception
                        throw new InvalidDataException("Invalid data encountered: " + line);
                    }
                }
            }
            return values;
        }

        public List<Double> validateData(List<Double> values) throws InvalidDataException {
            for (Double value : values) {
                if (value == null) {
                    throw new InvalidDataException("Null values are not allowed");
                }
            }
            return values;
        }

        public double calculateAverage(List<Double> validValues) {
            if (validValues.isEmpty()) {
                return 0;
            }
            double sum = 0;
            for (Double value : validValues) {
                sum += value;
            }
            return sum / validValues.size();
        }

        public void writeResultToFile(double average, String outputPath) throws IOException {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                writer.write("Average: " + average);
            }
        }
    }

    // Main Program
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        try {
            String inputFilePath = "C:\\Users\\91956\\Desktop\\Lab Weeks Solutions Sem2\\Week6\\input.txt"; // Specify the input file path here
            String outputFilePath = "C:\\Users\\91956\\Desktop\\Lab Weeks Solutions Sem2\\Week6\\output.txt"; // Specify the output file path here

            List<Double> values = processor.readValuesFromFile(inputFilePath);
            List<Double> validValues = processor.validateData(values);
            double average = processor.calculateAverage(validValues);
            processor.writeResultToFile(average, outputFilePath);

            System.out.println("Process completed successfully.");
        } catch (FileNotFoundException e) {
            System.err.println("The file was not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An IO error occurred: " + e.getMessage());
        } catch (InvalidDataException e) {
            System.err.println("Invalid data: " + e.getMessage());
        }
    }
}
