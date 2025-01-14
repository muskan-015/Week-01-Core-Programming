import java.util.Scanner;

public class LengthOfString {

    // Method to find the length of a string
    public static int StringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++; 
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String Input = sc.next();

        // Call the user defined method to find string length
        int UserDefinedLength = StringLength(Input);

        // Compare with built-in length() method
        int builtInLength = Input.length();

        // Display the results
        System.out.println("Length of the string (user defined method): " + UserDefinedLength);
        System.out.println("Length of the string (built-in method): " + builtInLength);

        sc.close();
    }
}
