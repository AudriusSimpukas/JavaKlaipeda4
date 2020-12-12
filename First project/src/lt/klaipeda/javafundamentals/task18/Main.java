package lt.klaipeda.javafundamentals.task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert text:");
        String text = input.nextLine();

        String textRegex = "(?i).*o!$";

        if (text.matches(textRegex)) {
            System.out.println("User sneezed...");
        }
    }
}
