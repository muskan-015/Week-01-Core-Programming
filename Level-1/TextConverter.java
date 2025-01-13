import java.util.Scanner;

public class TextConverter {

    // Method to convert a string to uppercase
    public static String convertUpperCase(String text) {
        StringBuilder upperCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') { 
                upperCaseText.append((char) (ch - 32)); 
            } else {
                upperCaseText.append(ch); 
            }
        }
        return upperCaseText.toString();
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
        System.out.println("Enter a string:");
        String Text = sc.nextLine();

        // uppercase using user defined method
        String UserDefinedUpperCase = convertUpperCase(Text);

        //uppercase using built-in method
        String builtInUpperCase = Text.toUpperCase();

        // Compare the results
        boolean Equal = compareStrings(UserDefinedUpperCase, builtInUpperCase);

        // Display the results
        System.out.println("User defined Uppercase: " + UserDefinedUpperCase);
        System.out.println("Built-in Uppercase: " + builtInUpperCase);
        System.out.println("strings equal " + Equal);

        sc.close();
    }
}
