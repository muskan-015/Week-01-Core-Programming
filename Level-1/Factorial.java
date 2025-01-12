import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // To Check if the user entered a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // create a Variable to store the factorial result
            int factorial = 1;

            // calculate the factorial using a while loop
            int i = 1;
            while (i <= number) {
                factorial *= i;  
                i++;              
            }

            // Print the factorial result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner
        sc.close();
    }
}
