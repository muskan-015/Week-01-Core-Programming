import java.util.Scanner;

public class FactorialProgram {

    // Recursive function to calculate factorial
    public static int Factorial(int number) {
        if (number == 0 || number == 1) {
            return 1; // Base case
        }
        return number * Factorial(number - 1); 
    }

    // Function to get user input
    public static int getInput(Scanner sc) {
        System.out.print("Enter a integer: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            sc.next(); 
            System.out.print("Enter a integer: ");
        }

        int input = sc.nextInt();
        if (input < 0) {
            System.out.println("enter positive numbers only");
            return getInput(sc); 
        }
        return input;
    }

    // Function to display the result
    public static void PrintResult(int number, int factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the input number
        int number = getInput(sc);

        // Calculate the factorial using the recursive function
        int factorial = Factorial(number);

        // Display the result
        PrintResult(number, factorial);

        sc.close();
    }
}
