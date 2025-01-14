import java.util.Scanner;

public class UniqueCharacter {

    // Method to calculate the length of the string without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Try accessing characters
                count++; // Increment count
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return count; // Return the total count
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = getLength(text); // Find length of string
        char[] uniqueChars = new char[length]; // To store unique characters
        int uniqueCount = 0; // Counter for unique characters
        
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i); // Get current character
            boolean isUnique = true; // Flag to check uniqueness
            
            // Check if the character is unique
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false; // If already exists, set to false
                    break;
                }
            }
            
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar; // Store unique character
                uniqueCount++; // Increment unique character count
            }
        }

        // Create a new array with exact size for unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        
        return result; // Return the unique character array
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Finding unique characters
        char[] uniqueCharacters = findUniqueCharacters(userInput);
        
        // Displaying the result
        System.out.println("Unique characters in the string:");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }

        scanner.close();
    }
}
