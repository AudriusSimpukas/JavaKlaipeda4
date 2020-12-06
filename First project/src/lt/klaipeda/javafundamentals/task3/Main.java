package lt.klaipeda.javafundamentals.task3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 2;

        int delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Delta negative.");
            return;
        }

        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("Root x1: %.2f%n", x1);
        double x2 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.printf("Root x2: %.2f%n", x2);
    }
}
