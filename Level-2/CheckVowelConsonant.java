import java.util.Scanner;

public class CheckVowelConsonant {

    // Method to check the character
    public static String checkCharacter(char ch) {
        // Convert to lowercase
        char lowerCh = Character.toLowerCase(ch);

        // Check if the character is a letter
        if (lowerCh >= 'a' && lowerCh <= 'z') {
            // Check if the character is a vowel
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string and return a 2D array
    public static String[][] findVowelsAndConsonants(String input) {
        String[][] result = new String[input.length()][2];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch); 
            result[i][1] = checkCharacter(ch);
        }
        return result;
    }

    // Method to display the 2D array 
    public static void displayResult(String[][] result) {
        System.out.print("Character             Type\n");
        System.out.println("------------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println( result[i][0]+ "   "+ result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String Input = sc.nextLine();

        // Find vowels and consonants in the string
        String[][] result = findVowelsAndConsonants(Input);

        // Display the result in a tabular format
        displayResult(result);

       sc.close();
    }
}
