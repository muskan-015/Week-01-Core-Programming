import java.util.Scanner;

public class CountdownForRocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the input from the user
        System.out.print("Enter the starting countdown value: ");
        int counter = sc.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launch!");
        sc.close();
    }
}
