import java.util.Scanner;

public class PalindromeCheck {

    //Iterative comparison of characters
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    //  Recursive comparison of characters
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Reverse the string
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    // Comparison using reversed string and toCharArray()
    public static boolean isPalindromeUsingReverse(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text).toCharArray();

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a text to check if it is a palindrome: ");
        String userInput = scanner.nextLine();

        //removing spaces and converting to lowercase
        String normalizedText = userInput.replaceAll("[\\s+]", "").toLowerCase();

        boolean isIterative = isPalindromeIterative(normalizedText);
        System.out.println("Is Palindrome (Iterative Logic)? " + isIterative);

        boolean isRecursive = isPalindromeRecursive(normalizedText, 0, normalizedText.length() - 1);
        System.out.println("Is Palindrome (Recursive Logic)? " + isRecursive);

        boolean isUsingReverse = isPalindromeUsingReverse(normalizedText);
        System.out.println("Is Palindrome (Using Reverse Logic)? " + isUsingReverse);

        scanner.close();
    }
}
