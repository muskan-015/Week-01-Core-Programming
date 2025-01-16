import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take user input
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);

        // Remove all occurrences of the specific character
        String result = removeCharacter(input, ch);

        // Display the result
        System.out.println("String after removing the character: " + result);

        sc.close();
    }

    public static String removeCharacter(String str, char ch) {
       
        return str.replaceAll(Character.toString(ch), "");
    }
}
