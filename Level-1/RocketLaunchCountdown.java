import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the countdown starting value: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;  // Decrement the counter
        }

        System.out.println("Rocket Launch!");
        sc.close();
    }
}
