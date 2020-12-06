package lt.klaipeda.javafundamentals.task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, insert two leters:");

        String[] insertedLetters = input.nextLine().toLowerCase().split("");
        boolean validLetter1 = insertedLetters[0].matches("[a-z]");
        boolean validLetter2 = insertedLetters[1].matches("[a-z]");

        if (insertedLetters.length != 2 || !validLetter1 || !validLetter2) {
            System.out.println("There must be ONLY TWO letters! Please, try again later.");
            return;
        }

        char firstLetter = insertedLetters[0].charAt(0);
        char lastLetter = insertedLetters[1].charAt(0);
        int firstLetterIndexValue = firstLetter;
        int lastLetterIndexValue = lastLetter;
        int numberInBetween;

        if (firstLetterIndexValue < lastLetterIndexValue) {
            numberInBetween = lastLetterIndexValue - firstLetterIndexValue - 1;
        } else {
            numberInBetween = firstLetterIndexValue - lastLetterIndexValue - 1;
        }

        System.out.println("There is/are " + numberInBetween + " character/s between given letters.");
    }
}
