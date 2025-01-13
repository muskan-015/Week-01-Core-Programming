import java.util.Scanner;

public class IllegalArgumentExceptionEx {

    // Method to generate IllegalArgumentException
    public static void createException(String text) {
        String result = text.substring(5, 2); // exception will occur (Start index > End index)
        System.out.println("substring: " + result);
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
           String result = text.substring(5, 2); // Start index > End index
            System.out.println("substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Invalid substring indices.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String Text = sc.nextLine();

        // Call method to generate the IllegalArgumentException
        createException(Text);

        // Call method to handle the exception
        handleException(Text);
    }
}
