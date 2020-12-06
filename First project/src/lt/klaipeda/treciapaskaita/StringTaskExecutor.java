package lt.klaipeda.treciapaskaita;

import java.util.Scanner;

public class StringTaskExecutor {

    public void execute3Task() {
        String text = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(text.toLowerCase());
    }

    public void execute4Task() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please insert a word:");
        String word1 = input1.nextLine();
        String reverseWord = "";

        for (int i = ((java.lang.String) word1).length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word1.charAt(i);
        }
        System.out.println("Reversed word is: " + reverseWord);
    }

    public void execute5Task() {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please insert a word:");
        String word2 = input2.nextLine();
        String extractedWord2 = "";

        if (word2.length() % 2 == 0) {
            int halfOfWord2 = word2.length() / 2;
            extractedWord2 = extractedWord2 + word2.substring(0, halfOfWord2);
            System.out.println("Extracted first half of word is: ");
            System.out.println(extractedWord2);
        } else {
            System.out.println("Inserted word is odd length.");
        }
    }

    public void execute6Task() {
        String word3 = "Java";
        String word4 = "Fundamentals";
        System.out.println(word3.substring(1).concat(word4.substring(1)));
    }

    public void execute7Task() {
        String word5 = "This is Java!";
        System.out.println(word5.length());
    }

    public void execute8Task() {
        String text1 = "This is a comparison";
        String text2 = "THIS is A Comparison";

        if (text1.equalsIgnoreCase(text2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }

    public void execute9Task() {
        String text3 = "Java exercises";
        String text4 = "ses";
        String text3End = text3.substring(text3.length() - text4.length());

        if (text4.equals(text3End)) {
            System.out.println("The given string ends with other strings content.");
        } else {
            System.out.println("The given string does not ends with other strings content.");
        }
    }

    public void execute10Task() {
        String text5 = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        for (int i = 0; i < text5.length(); i++) {
            if (Character.isLetter(text5.charAt(i))) {
                letter++;
            } else if (Character.isSpaceChar(text5.charAt(i))) {
                space++;
            } else if (Character.isDigit(text5.charAt(i))) {
                number++;
            } else {
                other++;
            }
        }
        System.out.println(letter + " letters,");
        System.out.println(space + " spaces,");
        System.out.println(number + " numbers,");
        System.out.println(other + " other simbols.");
    }
}
