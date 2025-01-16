import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input from user
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        // Call the method to reverse the string
        String reversedString = reverseString(input);

        // print the reversed string
        System.out.println("Reversed string: " + reversedString);

        sc.close();
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
