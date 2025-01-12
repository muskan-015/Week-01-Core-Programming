import java.util.Scanner;

public class BonusOfEmployee {
    public static void main(String[] args) {
        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // take user input for salary and year of service
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = sc.nextInt();

        // To Check if the employee is eligible for a bonus
        double bonus = 0.0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus 
        }

        // Print the bonus amount
        System.out.println("The employee's bonus is: INR " + bonus);

        // Close the scanner
        sc.close();
    }
}
