package lt.klaipeda.javafundamentals.task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, insert ten numbers:");

        int [] insertedNumbers = new int[10];

        for (int i = 0; i < insertedNumbers.length; i++) {
            insertedNumbers [i] = input.nextInt();
        }
        for (int j = 0; j < insertedNumbers.length; j++) {
            for (int k = j + 1; k < insertedNumbers.length; k++) {
                if (insertedNumbers[j] == insertedNumbers[k]) {
                    System.out.print(insertedNumbers[j] + ", ");
                }
            }
        }
    }
}
