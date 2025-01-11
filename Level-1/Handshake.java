import java.util.Scanner;

public class Handshake {

    public static void main(String[] args) {
        // Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // user input for the number of students
        System.out.print("Enter the number of students: ");
        int number_Of_Students = input.nextInt();  // Read the number of students

        // Calculate the maximum number of handshakes
        int handshakes = (number_Of_Students * (number_Of_Students - 1)) / 2;

        // Display the result
        System.out.printf("The maximum number of handshakes among "+number_Of_Students +" students is "+ handshakes);

        // Close the Scanner
        input.close();
    }
}
