import java.util.Scanner;

public class CompareString {
      // Method to compare two strings using charAt()
    public static boolean compareCharAt(String string1, String string2) {
        // Check if lengths are different
        if (string1.length() != string2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take strings as input
        System.out.println("Enter the first string:");
        String string1 = sc.next();

        System.out.println("Enter the second string:");
        String string2 = sc.next();

        // Compare using charAt() method
        boolean charAtCompare = compareCharAt(string1, string2);

        // Compare using built-in equals() method
        boolean equalsCompare = string1.equals(string2);

        // Display the results
        System.out.println("Comparison using charAt(): " + charAtCompare);
        System.out.println("Comparison using equals(): " + equalsCompare);

        // To check if both methods give the same result
        if (charAtCompare == equalsCompare) {
            System.out.println("same result.");
        } else {
            System.out.println("The results are different.");
        }
    }

  
}
