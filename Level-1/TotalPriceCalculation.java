import java.util.Scanner;

public class TotalPriceCalculation {

    public static void main(String[] args) {
        // Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // user input for unit price and quantity
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = input.nextDouble();  // Read unit price input

        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();  // Read quantity input

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.printf("The total purchase price is INR "+totalPrice +" if the quantity is "+quantity +" and unit price is INR "+unitPrice);

        // Close the Scanner
        input.close();
    }
}
