import java.util.Scanner;

public class Calculator {

    // Function for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for division
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not possible.");
        }
        return a / b;
    }

    // Function to get the user's choice
    public static int getChoice(Scanner sc) {
        System.out.println("Choose a operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            sc.next(); 
            System.out.print("Enter your choice (1-4): ");
        }

        int choice = sc.nextInt();
        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice.");
            return getChoice(sc);
        }

        return choice;
    }

    // Function to take a number from the user
    public static double getNumber(Scanner sc, String input) {
        System.out.print(input);
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input.");
            sc.next(); 
            System.out.print(input);
        }
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the operation choice
        int choice = getChoice(sc);

        // Get the two numbers from the user
        double num1 = getNumber(sc, "Enter the first number: ");
        double num2 = getNumber(sc, "Enter the second number: ");

        // Perform the operation
        double result = 0;
        
            switch (choice) {
                case 1 -> result = add(num1, num2);
                case 2 -> result = subtract(num1, num2);
                case 3 -> result = multiply(num1, num2);
                case 4 -> result = divide(num1, num2);
            }

            // Display the result
            System.out.println("The result of the operation is: " + result);

         
        sc.close();
    }
}
