package lt.klaipeda.javafundamentals.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a number:");

        int value = input.nextInt();
        int sum = 0;

        while (value != 0) {
            sum += value % 10;
            value /= 10;
        }
        System.out.println("Sum of digits of inserted number is: " + sum);
    }
}
