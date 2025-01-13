import java.util.Scanner;

public class CompareSubstring {
      // Method to create a substring using charAt()
    public static String SubstringCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }
     // Method to compare two strings using charAt()
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
        System.out.println("Enter the main string:");
        String String = sc.next();

        System.out.println("Enter the start index:");
        int start = sc.nextInt();

        System.out.println("Enter the end index:");
        int end = sc.nextInt();

        // Create substring using charAt()
        String substringCharAt = SubstringCharAt(String, start, end);

        // Create substring using built-in substring() method
        String substringBuiltIn = String.substring(start, end);

        // Compare the two substrings
        boolean Equal = compareStrings(substringCharAt, substringBuiltIn);

        // print results
        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using built-in substring(): " + substringBuiltIn);
        System.out.println("substrings equal : " +Equal);
    }

   

   
}
