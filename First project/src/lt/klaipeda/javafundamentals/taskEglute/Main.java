package lt.klaipeda.javafundamentals.taskEglute;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, insert a number:");

        int inputNumber = input.nextInt();
        int treeWidth = 4 * inputNumber + 1;
        int treeHigh = 2 * inputNumber + 1;

        for (int i = 1; i <= treeHigh; i++) {
            for (int j = 1; j <= treeWidth; j++) {
                if (i == 1 && j == treeWidth / 2) {
                    System.out.print("(*)");
                } else if (i > 1 && j == treeWidth / 2 + 2 - i) {
                    System.out.print("/");
                } else if (i > 1 && j == treeWidth / 2 + i) {
                    System.out.print("\\");
                } else if (i > 1 && i % 2 != 0 && j > treeHigh - i + 1 && j < treeHigh + i - 1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int k = 1; k <= treeWidth; k++) {
            if (k == treeWidth / 2 || k == treeWidth / 2 + 2) {
                System.out.print("|");
                continue;
            } else if (k == treeWidth / 2 + 1) {
                System.out.print("_");
                continue;
            }
            System.out.print(" ");
        }

    }
}
