import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();

        // Replace the word in the sentence
        String updatedSentence = replaceWord(sentence, oldWord, newWord);

        // Display the result
        System.out.println("Modified sentence: " + updatedSentence);

        sc.close();
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Use the replaceAll method
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }
}
