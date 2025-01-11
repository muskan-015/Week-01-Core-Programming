import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {
        // Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // user input for temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit 
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Display the result
        System.out.printf("The temperature "+celsius +"Celsius is "+fahrenheitResult +"fahrenheit");

        // Close the Scanner
        input.close();
    }
}
