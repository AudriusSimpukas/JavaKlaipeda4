package lt.klaipeda.javafundamentals.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert number:");
        int iterator = input.nextInt();

        if (iterator <= 0) {
            System.out.println("Wrong number.");
        }
        for (int i = 1; i <= iterator; i++) {

            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

