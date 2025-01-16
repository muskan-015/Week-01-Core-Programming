import java.util.Scanner;

public class FrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(input);

        // Display the result
        System.out.println("The most frequent character is: " + mostFrequentChar);

        sc.close();
    }

    public static char findMostFrequentCharacter(String str) {
        int maxCount = 0;
        char mostFrequentChar = str.charAt(0);

        // loop through the string 
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            int count = 0;

            // Count how many times the current character appears in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }
}
