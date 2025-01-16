import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Toggle the string
        String toggledString = toggleCase(input);

        // print the result
        System.out.println("String after toggling case: " + toggledString);

        sc.close();
    }

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch)); 
            }
            // Check if the character is lowercase
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch)); 
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
