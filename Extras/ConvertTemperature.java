import java.util.Scanner;

public class ConvertTemperature {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

 
    // Function to get the input from the user
    public static double getInput(Scanner sc, String input) {
        System.out.print(input);
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input.");
            sc.next(); 
            System.out.print(input);
        }
        return sc.nextDouble();
    }

    // Function to display the result
    public static void displayResult(double input, double result, String iUnit, String rUnit) {
        System.out.println(input+iUnit+" is equal to "+result+ rUnit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fahrenheit to celsius");
            double fahrenheit = getInput(sc, "Enter temperature in Fahrenheit: ");
            double celsius = fahrenheitToCelsius(fahrenheit);
            displayResult(fahrenheit, celsius, "Fahrenheit", "Celsius");
        System.out.println("celsius to Fahrenheit");
            double Celsius = getInput(sc, "Enter temperature in Celsius: ");
            double Fahrenheit = celsiusToFahrenheit(Celsius);
            displayResult(Celsius, Fahrenheit, "Celsius", "Fahrenheit");
        

        sc.close();
    }
}
