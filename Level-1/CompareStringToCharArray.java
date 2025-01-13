import java.util.Scanner;

public class CompareStringToCharArray {
    // Method to return characters in a string
    public static char[] CharFromString(String str) {
        char[] Array = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            Array[i] = str.charAt(i);
        }
        return Array;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        // Check if lengths are different
        if (array1.length != array2.length) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String String = sc.next();

        // Convert the string to a character array using a user-defined method
        char[] userDefinedArray = CharFromString(String);

        // Convert the string to a character array using the built-in method
        char[] builtInArray = String.toCharArray();

        // Compare the two arrays
        boolean Equal = compareCharArrays(userDefinedArray, builtInArray);

        // Display results
        System.out.println("Characters from user-defined method: " + new String(userDefinedArray));
        System.out.println("Characters from built-in toCharArray(): " + new String(builtInArray));
        System.out.println("arrays equal " + Equal);
    }
}
