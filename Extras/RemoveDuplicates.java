import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Remove duplicates
        String result = removeDuplicate(input);

        // Display the result
        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }

    public static String removeDuplicate(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Add the character to result only if it's not already there
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        return result;
    }
}
