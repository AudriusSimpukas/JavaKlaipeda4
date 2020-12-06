package lt.klaipeda.javafundamentals.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a number:");

        int value = input.nextInt();

        if (value <= 0) {
            System.out.println("Input number must be positive.");
            return;
        }
        int number1 = 0;
        int number2 = 1;
        int number3 = number1 + number2;

        for (int i = 3; i <= value; i++) {
            number1 = number2;
            number2 = number3;
            number3 = number1 + number2;
        }
        System.out.println(number3);
    }
}
