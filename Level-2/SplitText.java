import java.util.Scanner;

public class SplitText {

    // Method to split text into words
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

    // Method to find the length of a string
    public static int StringLength(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        return length;
    }

    // Method to generate a 2D array of words and their lengths
    public static String[][] WordLengthArray(String[] words) {
        String[][] Array = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            Array[i][0] = words[i];
            Array[i][1] = String.valueOf(StringLength(words[i]));
        }

        return Array;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String Text = sc.nextLine();

        // Split the text into words
        String[] words = splitText(Text);

        // Generate 2D array of words and their lengths
        String[][] Array = WordLengthArray(words);

        // print the result
        System.out.printf( "Word            Length\n");
        System.out.println("-----------------------");

        for (int i = 0; i < Array.length; i++) {
            String word = Array[i][0];
            int length = Integer.parseInt(Array[i][1]);
            System.out.print(word+ "      "+length+" \n");
        }

        sc.close();
    }
}
