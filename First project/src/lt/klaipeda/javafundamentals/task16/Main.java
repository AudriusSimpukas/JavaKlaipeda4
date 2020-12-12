package lt.klaipeda.javafundamentals.task16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, insert ten mumbers:");

        int[] numberArray = new int[10];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = input.nextInt();
        }

        int sum = 1;
        int max = 1;
        for (int j = 0; j < numberArray.length - 1; j++) {
            if (numberArray[j] < numberArray[j + 1]) {
                sum++;
                max = Math.max(sum, max);
            }else {
                sum = 1;
            }
        }
        System.out.println(max);
    }
}
