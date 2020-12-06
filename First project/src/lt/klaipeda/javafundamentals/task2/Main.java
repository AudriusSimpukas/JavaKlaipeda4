package lt.klaipeda.javafundamentals.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float weight;
        int height;

        System.out.println("Please insert Your weight (kg):");
        weight = input.nextFloat();
        System.out.println("Please insert Your height (cm);");
        height = input.nextInt();

        float bmi = weight / (height * height) * 10000;
        System.out.printf("Your BMI is: %.1f%n", bmi);

        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI is optimal");
        } else {
            System.out.println("BMI is not optimal");
        }
    }
}
