import java.util.Scanner;

public class TextConverter_Lowercase {

    // Method to convert a string to lowercase
    public static String convertLowerCase(String text) {
        StringBuilder lowerCase = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') { 
                lowerCase.append((char) (ch + 32)); 
            } else {
                lowerCase.append(ch); 
            }
        }
        return lowerCase.toString();
    }

    // Method to compare two strings character by character
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

        // lowercase using uder defined method
        String UserDefinedLowerCase = convertLowerCase(Text);

        //lowercase using built-in method
        String builtInLowerCase = Text.toLowerCase();

        // Compare the results
        boolean Equal = compareStrings(UserDefinedLowerCase, builtInLowerCase);

        // Display the results
        System.out.println("user defined Lowercase: " + UserDefinedLowerCase);
        System.out.println("Built-in Lowercase: " + builtInLowerCase);
        System.out.println("strings equal " + Equal);

        sc.close();
    }
}
