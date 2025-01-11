import java.util.Scanner;

public class TotalIncome {

    public static void main(String[] args) {
        // Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        //user input for salary and bonus
        System.out.print("Enter the salary: ");
        int salary = input.nextInt();

        System.out.print("Enter the bonus: ");
        int bonus = input.nextInt();

        // Compute the total income 
        int totalIncome = salary + bonus;

        // Display the result
        System.out.printf("The salary is INR "+salary +" and bonus is INR "+bonus +". Hence Total Income is INR "+ totalIncome);

        // Close the Scanner
        input.close();
    }
}
