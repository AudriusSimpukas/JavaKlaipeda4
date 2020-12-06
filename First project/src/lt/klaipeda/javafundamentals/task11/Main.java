package lt.klaipeda.javafundamentals.task11;

import java.util.Scanner;

public class Main {

    private static final String BREAKEWORD = "Stop";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputText;
        String longestText = "";

        while (true) {
            System.out.println("Enter text:");
            inputText = input.nextLine();

            if (BREAKEWORD.equalsIgnoreCase(inputText)) break;
            if (inputText.length() == 0) {
                System.out.println("No text provided.");
                return;
            }
            longestText = longestText.length() < inputText.length() ? inputText : longestText;
        }
        System.out.println(longestText);
    }
}
