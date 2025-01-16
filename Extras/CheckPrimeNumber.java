import java.util.Scanner;

public class CheckPrimeNumber {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            sc.next(); 
            System.out.print("Enter a number to check if it is prime: ");
        }
        int number = sc.nextInt();

        // To Check if the number is prime and print the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();
    }
}
