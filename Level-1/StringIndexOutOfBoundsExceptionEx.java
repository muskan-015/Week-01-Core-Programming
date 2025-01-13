import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionEx {

    // Method to generate StringIndexOutOfBoundsException
    public static void createException(String text) {
        System.out.println("access a character at an invalid index");
        char character = text.charAt(100); 
        System.out.println("Character at index 100: " + character);
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
           char character = text.charAt(100);  
            System.out.println("Character at index 100: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Invalid index.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking input from the user as a string
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call method to generate the StringIndexOutOfBoundsException
        createException(text);

        // Call method to handle the exception
        handleException(text);
    }
}
