import java.util.Scanner;

public class TemperatureConversion_F_To_C {

    public static void main(String[] args) {
        // Scanner object for taking input from user
        Scanner input = new Scanner(System.in);

        // user input for temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Fahrenheit to Celsius conversion
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.printf("The temperature "+fahrenheit +" Fahrenheit is "+celsiusResult +" Celsius" );

        // Close the Scanner
        input.close();
    }
}
