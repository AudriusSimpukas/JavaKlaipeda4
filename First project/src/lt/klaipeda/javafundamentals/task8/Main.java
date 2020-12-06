package lt.klaipeda.javafundamentals.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float number1 = input.nextFloat();
        char operator = input.next().charAt(0);
        float number2 = input.nextFloat();
        float result = 0F;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Cannot calculate.");
                    return;
                } else {
                    result = number1 / number2;
                    break;
                }
            default:
                System.out.println("Invalid operator.");
        }
        System.out.printf("%.2f", result);
    }
}
