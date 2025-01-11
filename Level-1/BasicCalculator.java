import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        //Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display the results
        System.out.printf(
                "The addition, subtraction, multiplication and division value of "
                +number1+" and "+number2+" is "+addition+", "+subtraction+", "
                +multiplication+", and "+division
        );

        // Close the Scanner
        input.close();
    }
}
