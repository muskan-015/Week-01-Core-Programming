import java.util.Scanner;

public class ChocolateDistribution {

    public static void main(String[] args) {
        //Scanner object for taking user input
        Scanner sc = new Scanner(System.in);

        //user input for number of chocolates and children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // The number of chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        //The number of remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the results
        System.out.printf("The number of chocolates each child gets is "+chocolatesPerChild +" and the number of remaining chocolates are "+ remainingChocolates);

        // Close the Scanner
        sc.close();
    }
}
