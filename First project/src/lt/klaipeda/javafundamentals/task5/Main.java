package lt.klaipeda.javafundamentals.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pkease insert a number:");

        int iterator = input.nextInt();

        if (iterator <= 0) {
            System.out.println("Input number must be positive.");
            return;
        }
        for (int i = 1; i <= iterator; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
