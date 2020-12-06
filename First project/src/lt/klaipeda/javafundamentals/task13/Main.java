package lt.klaipeda.javafundamentals.task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, insert a text:");

        String newText = input.nextLine();
        String [] splitedText = newText.split("\\s");

        for (int i = 0; i < splitedText.length; i++) {
            System.out.print(splitedText[i] + " " + splitedText[i] + " ");
        }
    }
}
