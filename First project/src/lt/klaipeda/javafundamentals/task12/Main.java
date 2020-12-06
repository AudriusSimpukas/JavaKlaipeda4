package lt.klaipeda.javafundamentals.task12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a text:");

        String insertedText = input.nextLine();
        int numberOfSpaces = 0;

        for (int i = 0; i < insertedText.length(); i++) {
            if (insertedText.charAt(i) == ' ') numberOfSpaces++;
        }

        int procentai = numberOfSpaces * 100 / insertedText.length();
        System.out.println("The percentage of 'space' character in the text is: " + procentai + "%");
    }
}
