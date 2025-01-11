import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        //Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Take user input for base and height of the triangle
        System.out.print("Enter the base of the triangle : ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle : ");
        double height = input.nextDouble();

        //area of the triangle in square centimeters
        double areaCm2 = 0.5 * base * height;

        // Conversion factor
        double Cm_Inch_converter= 6.4516;

        // Convert the area from square cm to square inches
        double areaInches2 = areaCm2 / Cm_Inch_converter;

        // Display the results
        System.out.printf(
                "The area of the triangle in square centimeters is "+areaCm2+" cm² and in square inches is "+areaInches2+" in²"
        );

        // Close the Scanner
        input.close();
    }
}
