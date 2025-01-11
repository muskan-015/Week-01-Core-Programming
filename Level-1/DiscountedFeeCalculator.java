import java.util.Scanner;

public class DiscountedFeeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Take user input for fee and discount percentage
        System.out.print("Enter the student fee: INR ");
        double fee = input.nextDouble();  // Read fee input

        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();  // Read discount percentage input

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final discounted fee
        double discountedFee = fee - discount;

        // Display the results
        System.out.printf(
                "The discount amount is INR "+discount+" and final discounted fee is INR "
                +discountedFee
        );

        // Close the Scanner
        input.close();
    }
}
