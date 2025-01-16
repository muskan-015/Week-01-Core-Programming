import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

    // take a random guess 
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return low + random.nextInt(high - low + 1);
    }

    // take feedback from the user
    public static String getFeedback(Scanner sc) {
        System.out.print("guess too high (H), too low (L), or correct (C): ");
        return sc.next().toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        boolean Correctguess = false;

        System.out.println("Think of a number between 1 and 100");
        System.out.println("Give feedback: H (High), L (Low), or C (Correct).");

        while (!Correctguess) {
            int guess = generateGuess(low, high);
            System.out.println("guess is: " + guess);

            String feedback = getFeedback(sc);

            switch (feedback) {
                case "H":
                    high = guess - 1;
                    break;
                case "L":
                    low = guess + 1; 
                    break;
                case "C":
                    Correctguess = true; 
                    System.out.println(" guessed number: " + guess);
                    break;
                default:
                    System.out.println("Invalid feedback.");
            }

            // Check for invalid range
            if (low > high) {
                System.out.println("Something went wrong.");
                break;
            }
        }

        sc.close();
    }
}
