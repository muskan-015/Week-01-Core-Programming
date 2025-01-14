import java.util.Scanner;
import java.util.Arrays;

public class SplitAndFind {

    // Method to find the length of a string
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

   // Method to generate a 2D array of words and their lengths
    public static String[][] WordLengthArray(String[] words) {
        String[][] Array = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            Array[i][0] = words[i];
            Array[i][1] = String.valueOf(getLength(words[i]));
        }

        return Array;
    }


    // Method to find the shortest and longest word lengths
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int[] result = new int[2];
        int shortLength = Integer.MAX_VALUE;
        int longLength = Integer.MIN_VALUE;

        for (int i = 0; i < wordLengthArray.length; i++) {
            String[] wordLength = wordLengthArray[i];
            int length = Integer.parseInt(wordLength[1]);
            if (length < shortLength) {
                shortLength = length;
            }
            if (length > longLength) {
                longLength = length;
            }
        }

        result[0] = shortLength; 
        result[1] = longLength;  

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String Input = sc.nextLine();

        // Split the text into words using the custom method
        String[] words = splitText(Input);

        // Create the 2D array of word and corresponding length
        String[][] wordLengthArray = WordLengthArray(words);

        // Find the shortest and longest word lengths
        int[] shortestAndLongest = findShortestAndLongest(wordLengthArray);

        // Display the result
        System.out.println("Words: " + Arrays.toString(words));
        System.out.println("Shortest word length: " + shortestAndLongest[0]);
        System.out.println("Longest word length: " + shortestAndLongest[1]);

        sc.close();
    }
}
