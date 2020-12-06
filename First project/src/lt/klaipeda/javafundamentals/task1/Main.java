package lt.klaipeda.javafundamentals.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = Math.PI;

        System.out.println("Please insert diameter of a circle:");
        float diameter = input.nextFloat();

        double perimeter = pi * diameter;
        System.out.println(perimeter);

    }
}
