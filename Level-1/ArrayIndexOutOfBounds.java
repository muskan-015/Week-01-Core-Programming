import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void createException(String[] names) {
        System.out.println("Calling an invalid index");
        System.out.println(names[5]); 
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            // Trying to access an invalid index
            System.out.println("access an invalid index");
            System.out.println(names[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the number of names you want to store: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        // Taking names from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Call method to generate the ArrayIndexOutOfBoundsException
        createException(names);

        // Call method to handle the exception
        handleException(names);
    }
}
