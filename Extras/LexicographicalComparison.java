import java.util.Scanner;

public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Compare strings lexicographically
        int result = compareLexicographically(str1, str2);

        // Display the result
        if (result < 0) {
            System.out.println("\"" + str1 + "\" is lexicographically smaller than \"" + str2 + "\".");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\".");
        } else {
            System.out.println("Both strings are lexicographically equal.");
        }

        sc.close();
    }

    public static int compareLexicographically(String str1, String str2) {
        int Length = Math.min(str1.length(), str2.length());

        for (int i = 0; i < Length; i++) {
            // Compare characters at the same position
            if (str1.charAt(i) < str2.charAt(i)) {
                return -1; // str1 is lexicographically smaller
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return 1; // str1 is lexicographically greater
            }
        }

        // If all characters are the same up to the length of the shorter string
        if (str1.length() < str2.length()) {
            return -1;
        } else if (str1.length() > str2.length()) {
            return 1; 
        }

        return 0;
    }
}
