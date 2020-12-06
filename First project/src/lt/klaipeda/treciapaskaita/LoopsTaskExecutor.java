package lt.klaipeda.treciapaskaita;

import java.util.Scanner;

public class LoopsTaskExecutor {

    public void execute1Task() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please, insert a number:");
        int number1 = input1.nextInt();

        System.out.print("A multiplication table for inserted number is: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print(number1 * i + " ");
        }
    }

    public void execute2Task() {
        System.out.print("Even numbers, from 1 to 100, are: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void execute3Task() {
        Scanner input3 = new Scanner(System.in);
        System.out.println("Please, insert a number:");
        int n = input3.nextInt();

        System.out.printf("%d, %d%d, %d%d%d, %d%d%d%d, %d%d%d%d%d", n, n, n, n, n, n, n, n, n, n, n, n, n, n, n);
    }

    public void execute4Task() {

        System.out.print("Divided by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\nDivided by 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\nDivided by 3 & 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

    }

    public void execute5Task() {
        int number5 = 3;
        int powerOfNumber = 1;

        System.out.println("Powers of a number " + number5 + " are: ");

        while (powerOfNumber < 100) {
            powerOfNumber = powerOfNumber * number5;

            if (powerOfNumber > 100 ) {
                break;
            }
            System.out.print(powerOfNumber + ", ");
        }
    }
}

