package lt.klaipeda.javafundamentals.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a number:");

        int iterator = input.nextInt();

        while (iterator <= 1) {
            System.out.println("Wrong number. Insert number from 2 and higher!");
            iterator = input.nextInt();
        }
        float sum = 1f;

        for (float i = 2; i <= iterator; i++) {
            sum = sum + 1 / i;
        }
        System.out.printf("%.4f", sum);
    }
}
