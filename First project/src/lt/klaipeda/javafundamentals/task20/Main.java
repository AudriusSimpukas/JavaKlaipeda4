package lt.klaipeda.javafundamentals.task20;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, insert number from 0 to 100:");

        int insertedNumber = input.nextInt();
        int numberToMatch = new Random().nextInt(99);

        while (insertedNumber != numberToMatch) {
            if (insertedNumber < numberToMatch) {
                System.out.println("not enough");
                insertedNumber = input.nextInt();
            } else {
                System.out.println("too much");
                insertedNumber = input.nextInt();
            }
        }
        System.out.println("Congratulations!");
    }
}
