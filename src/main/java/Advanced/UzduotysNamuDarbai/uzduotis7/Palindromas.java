package Advanced.UzduotysNamuDarbai.uzduotis7;

import java.util.Scanner;

public class Palindromas {

    public static void main(String[] args) {

        System.out.println("Please, insert a word:");

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        char[] splittedWord = word.toCharArray();

        StringBuilder input1 = new StringBuilder();
        String word1 = input1.append(word).reverse().toString();

        char[] reversedWord = word1.toCharArray();

        boolean palindrom = false;

        for (int i = 0; i <= splittedWord.length / 2; i++) {
            if (splittedWord[i] == reversedWord[i]) {
                palindrom = true;
            } else {
                palindrom = false;
                break;
            }
        }

        if (palindrom) {
            System.out.println("Tai palindromas!");
        } else {
            System.out.println("Zodis yra ne palindromas.");
        }
    }
}
