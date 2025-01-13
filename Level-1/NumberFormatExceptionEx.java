import java.util.Scanner;

public class NumberFormatExceptionEx {

    // Method to generate NumberFormatException
    public static void createException(String text) {
        System.out.println("Trying to parse the text to an integer");
        int number = Integer.parseInt(text); 
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            System.out.println("Trying to parse the text to an integer");
            int number = Integer.parseInt(text); 
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Invalid number format.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking input from the user as a string
        System.out.print("Enter a number (or non-number to create exception): ");
        String Text = sc.nextLine();

        // Call method to generate the NumberFormatException
        createException(Text);

        // Call method to handle the exception
        handleException(Text);
    }
}
