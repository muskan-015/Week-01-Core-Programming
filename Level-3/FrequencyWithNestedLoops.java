import java.util.Scanner;

public class FrequencyWithNestedLoops {

    // Method to find the frequency of characters
    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray(); // Convert text to character array
        int[] frequency = new int[chars.length]; // Frequency array
        int n = chars.length;

        // Outer loop to calculate frequency for each character
        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') {
                continue; // Skip already counted characters
            }
            frequency[i] = 1; // Initialize frequency to 1
            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++; // Increment frequency
                    chars[j] = '0'; // Mark duplicate character
                }
            }
        }

        // Create an array to store the result
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }
        String[] result = new String[uniqueCount];
        int index = 0;

        // Store unique characters and their frequencies
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " - " + frequency[i];
            }
        }

        return result;
    }

    // Method to display the frequency
    public static void displayFrequencies(String[] frequencies) {
        System.out.println("Character - Frequency");
        
        for (String entry : frequencies) {
            System.out.println(entry);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Find and display character frequencies
        String[] frequencies = findCharacterFrequency(userInput);
        displayFrequencies(frequencies);

        scanner.close();
    }
}
