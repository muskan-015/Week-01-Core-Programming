import java.util.Scanner;

public class CharacterFrequency {
    
    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Frequency array for ASCII characters

        // Calculate frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Count unique characters for sizing the result array
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        // Store characters and their frequencies in a 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i); // Store character
                result[index][1] = Integer.toString(frequency[i]); // Store frequency
                index++;
            }
        }

        return result; // Return the result array
    }

    // Method to display the result in a tabular format
    public static void displayFrequencies(String[][] frequencies) {
        System.out.printf( "Character"+ "  Frequency");
        
        for (String[] row : frequencies) {
            System.out.printf( row[0]+ " "+ row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Finding the frequency of characters
        String[][] frequencies = findCharacterFrequency(userInput);

        // Displaying the result
        displayFrequencies(frequencies);

        scanner.close();
    }
}
