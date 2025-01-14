import java.util.Scanner;

public class StringTrim {

    // Method to trim the leading and trailing spaces
    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the start index of the string
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the end index of the string 
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end indexes
        return new int[]{start, end};
    }

    // Method to create a substring
    public static String Substring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i)); 
        }
        return result.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String Input = sc.nextLine();

        // Trim the leading and trailing spaces
        int[] trimIndex = trimSpaces(Input);
        String trimString = Substring(Input, trimIndex[0], trimIndex[1]);

        // Trim the string using the built-in trim() method
        String builtInTrimmedString = Input.trim();

        // Compare the two strings
        boolean Equal = compareStrings(trimString, builtInTrimmedString);

        // Display the results
        System.out.println("Trimmed String using charAt(): " + "\"" + trimString + "\"");
        System.out.println("Trimmed String using built-in trim(): " + "\"" + builtInTrimmedString + "\"");
        System.out.println("trimmed strings equal " + Equal);

        sc.close();
    }
}
