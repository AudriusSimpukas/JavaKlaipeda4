package Advanced.UzduotysNamuDarbai.uzduotis8;

import java.util.Scanner;

public class PlayGame {

    private static String wordToGuess = LoadGame.generateWordToGuess();
    private static String hiddenWord = wordToGuess.replaceAll("\\w", "_");

    private static String[] splittedWord = wordToGuess.split("");
    private static String[] splittedHiddenWord = hiddenWord.split("");

    public static String start() {
        int counter = 0;

        String wordToPrint = String.join(" ", splittedHiddenWord);

        while (counter != splittedWord.length) {
            int counter1 = 0;

            System.out.println(wordToPrint);
            System.out.println("Guess a letter or a whole word:");

            Scanner input = new Scanner(System.in);
            String guessedLetter = input.nextLine();

            if (guessedLetter.length() == 1) {
                for (int i = 0; i < splittedWord.length; i++) {
                    if (splittedWord[i].equalsIgnoreCase(guessedLetter)) {
                        splittedHiddenWord[i] = guessedLetter.toUpperCase();
                        wordToPrint = String.join(" ", splittedHiddenWord);
                        counter++;
                        counter1++;
                    }
                }
            } else if (guessedLetter.length() > 1 && guessedLetter.length() <= splittedWord.length) {
                if (guessedLetter.equalsIgnoreCase(wordToGuess)) {
                    System.out.println(wordToGuess);
                    System.out.println("You are perfectly right!");
                    break;
                } else {
                    System.out.println("Wrong word!");
                    continue;
                }
            } else {
                System.out.println("Wrong input!");
                continue;
            }
            if (counter1 == 0) {
                System.out.println("No such letter.");
            }
            if (counter == splittedWord.length) {
                System.out.println(wordToPrint);
                System.out.println("You won!");
            }
        }
        return wordToPrint;
    }
}
