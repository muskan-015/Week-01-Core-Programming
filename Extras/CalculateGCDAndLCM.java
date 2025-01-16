import java.util.Scanner;

public class CalculateGCDAndLCM {

    // Function to calculate the GCD
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the LCM
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    // Function to get user input
    public static int getInput(Scanner sc, String input) {
        System.out.print(input);
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            sc.next(); 
            System.out.print(input);
        }
        return sc.nextInt();
    }

    // Function to print the results
    public static void displayResults(int num1, int num2, int gcd, int lcm) {
        System.out.println("For the numbers " + num1 + " and " + num2 + ":");
        System.out.println("Greatest Common Divisor (GCD): " + gcd);
        System.out.println("Least Common Multiple (LCM): " + lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input numbers from the user
        int num1 = getInput(sc, "Enter the first number: ");
        int num2 = getInput(sc, "Enter the second number: ");

        // Calculate GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        // Display the results
        displayResults(num1, num2, gcd, lcm);

        sc.close();
    }
}
