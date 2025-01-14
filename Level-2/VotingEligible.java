import java.util.Scanner;
import java.util.Random;

public class VotingEligible {

    // Method to define the random 2-digit age of n students
    public static int[] RandomAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];

        // Generate random ages between 18 and 99 (2-digit ages)
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = 18 + random.nextInt(82); 
        }

        return ages;
    }

    // Method to check whether the student can vote
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];

            // check age 
            if (age < 0) {
                result[i][0] = String.valueOf(age);
                result[i][1] = "Cannot Vote";
            } else {
                result[i][0] = String.valueOf(age);
                if (age >= 18) {
                    result[i][1] = "Can Vote";
                } else {
                    result[i][1] = "Cannot Vote";
                }
            }
        }

        return result;
    }

    // Method to display the 2D array
    public static void displayEligibility(String[][] result) {
        System.out.println("Age           Voting Status");
        System.out.println("----------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println( result[i][0]+"        "+ result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        if (numberOfStudents < 1 || numberOfStudents > 10) {
            System.out.println("Invalid number of students.");
            return;
        }

        // Generate random ages for the students
        int[] Ages = RandomAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibility = checkEligibility(Ages);

        // Display the results
        displayEligibility(eligibility);

        sc.close();
    }
}
