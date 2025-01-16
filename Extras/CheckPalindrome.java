import java.util.Scanner;

public class CheckPalindrome {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        
        // Compare characters from both ends
        int left = 0, right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to take user input
    public static String getInput(Scanner sc) {
        System.out.print("Enter a string : ");
        return sc.nextLine();
    }

    // Function to print the result
    public static void showResult(String input, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the input string
        String input = getInput(sc);

        // Check if the string is a palindrome
        boolean result = isPalindrome(input);

        // Display the result
        showResult(input, result);

        sc.close();
    }
}
