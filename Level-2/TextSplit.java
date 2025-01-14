import java.util.Scanner;
import java.util.Arrays;

public class TextSplit {

    // Method to find the length of the string
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;   
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    // Method to split the text into words 
    public static String[] splitText(String text) {
         StringBuilder word = new StringBuilder();
        int space = 32; // ASCII value for space=32
        int index = 0;
        String[] words = new String[text.length()];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if ((int) ch != space) {
                word.append(ch);
            } else if (word.length() > 0) {
                words[index++] = word.toString();
                word.setLength(0);
            }
        }

        if (word.length() > 0) {
            words[index++] = word.toString();
        }

        String[] result = new String[index];
        System.arraycopy(words, 0, result, 0, index);
        return result;

    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] array1, String[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String Input = sc.nextLine();

        // Split using the user defined method
        String[] userSplitWords = splitText(Input);

        // Split using the built-in split() method
        String[] builtInSplitWords =Input.split(" ");

        // Compare the two arrays
        boolean Equal = compareArrays(userSplitWords, builtInSplitWords);

        // Display the results
        System.out.println("Words split by user defined method: " + Arrays.toString(userSplitWords));
        System.out.println("Words split by built-in split method: " + Arrays.toString(builtInSplitWords));
        System.out.println(" same result " + Equal);

        sc.close();
    }
}
