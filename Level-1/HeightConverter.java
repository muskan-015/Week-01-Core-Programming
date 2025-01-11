import java.util.Scanner;

public class HeightConverter {

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();  // Read height in cm

        // Conversion variables
        double CM_TO_INCH_CONVERSION = 2.54; // 1 inch = 2.54 cm
        int INCH_IN_FOOT = 12; // 1 foot = 12 inches

        // Convert height in centimeters to inches
        double heightInches = heightCm / CM_TO_INCH_CONVERSION;

        // Calculate feet and remaining inches
        int feet = (int) (heightInches / INCH_IN_FOOT); // Integer division for feet
        int inches = (int) (heightInches % INCH_IN_FOOT); // Remainder for inches

        // Display the results
        System.out.printf("Your height in cm is "+heightCm+" while in feet is "+feet+" and inches is "+ inches);

        // Close the Scanner
        input.close();
    }
}
