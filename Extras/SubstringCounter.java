import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the main string: ");
        String String = sc.nextLine();

        System.out.print("Enter the substring to count: ");
        String substring = sc.nextLine();

        // Count occurrences of the substring
        int count = SubstringOccurrences(String, substring);

        // Display the result
        System.out.println("The substring \"" + substring + "\" occurs " + count + " times in the main string.");

        sc.close();
    }

    public static int SubstringOccurrences(String String, String substring) {
        int count = 0;
        int index = 0;

        // Loop through the main string
        while ((index = String.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move index forward to avoid overlapping counts
        }

        return count;
    }
}
