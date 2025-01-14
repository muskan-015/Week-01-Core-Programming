import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    
    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256]; // Frequency array for ASCII characters
        
        // Calculate frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if no non-repeating character exists
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Finding the first non-repeating character
        char result = findFirstNonRepeating(userInput);

        // Displaying the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}
