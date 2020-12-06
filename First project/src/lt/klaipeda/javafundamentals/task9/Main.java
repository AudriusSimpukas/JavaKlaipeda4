package lt.klaipeda.javafundamentals.task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a number:");

        int insertedNumber = input.nextInt();
        int waweWidth = insertedNumber * 2 - 1;

        for (int row = 1; row <= insertedNumber; row++) {
            for (int i = 0; i < insertedNumber; i++) {
                for (int column = 1; column <= waweWidth; column++) {
                    if (column == row || column == waweWidth - row + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

//        int symbol = 10;
//
//        for (int i = 1; i <= symbol; i++) {
//            for (int j = 1; j <= symbol; j++) {
//                if (i == 1 || i == symbol || j == 1 || j == symbol || i == j || j == symbol - i + 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
    }
}
