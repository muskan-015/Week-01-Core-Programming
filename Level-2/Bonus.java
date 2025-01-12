import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Define arrays for salary and years of service
        double[] salary = new double[10];
        int[] year = new int[10];

        // Define arrays for new salary and bonus
        double[] newSalary = new double[10];
        double[] bonus = new double[10];

        //Create Variables
        double totalBonus = 0;
        double totalSalary = 0;
        double totalNewSalary = 0;

        // Take input from user
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;

            while (!validInput) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();

                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                year[i] = sc.nextInt();

                // to check the salary and years of service
                if (salary[i] > 0 && year[i] >= 0) {
                    validInput = true;  
                } else {
                    System.out.println("Invalid input.");
                }
            }
        }

        // Calculate bonus, new salary, and total bonus/salary
        for (int i = 0; i < 10; i++) {
            double bonusPercent = (year[i] > 5) ? 0.05 : 0.02;  
            bonus[i] = salary[i] * bonusPercent;  // bonus calculation
            newSalary[i] = salary[i] + bonus[i];   // new salary calculation

            // Update the total bonus and total salaries
            totalBonus += bonus[i];
            totalSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // print the results
        System.out.println("Total Bonus : " + totalBonus);
        System.out.println("Total Old Salary: " + totalSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " - Bonus: " + bonus[i] + ", New Salary: " + newSalary[i]);
        }
    }
}
