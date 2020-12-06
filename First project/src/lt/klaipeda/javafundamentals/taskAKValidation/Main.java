package lt.klaipeda.javafundamentals.taskAKValidation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, insert personal number:");
        String personalNumber = input.nextLine();

        String[] symbolsInPN = personalNumber.split("");

        boolean validationOfLengthAndSymbols = false;
        boolean validationOfFirstDigit = false;
        boolean validationOf2to7Digits = false;
        boolean validationOfControlNumber = false;

        // Tikrinama, ar AK yra vien tik skaiciai.
        boolean personalNumberSymbols = personalNumber.matches("^[0-9]+$");

        // Jei AK yra tik skaiciai ir tinkamo ilgio:
        if (personalNumberSymbols && personalNumber.length() == 11) {
            validationOfLengthAndSymbols = true;

            // Stringas paverciamas i skaiciu masyva.
            int[] numbersInPN = new int[personalNumber.length()];
            for (int i = 0; i < personalNumber.length(); i++) {
                numbersInPN[i] = Integer.parseInt(symbolsInPN[i]);
            }

            // Ar geras pirmas skaicius?
            if (numbersInPN[0] >= 1 && numbersInPN[0] <= 6) {
                validationOfFirstDigit = true;
            } else validationOfFirstDigit = false;

            // Ar teisinga gimimo data?
            String beginingOfYear = "";
            if (numbersInPN[0] == 1 || numbersInPN[0] == 2) {
                beginingOfYear = "18";
            } else if (numbersInPN[0] == 3 || numbersInPN[0] == 4) {
                beginingOfYear = "19";
            } else if (numbersInPN[0] == 5 || numbersInPN[0] == 6) {
                beginingOfYear = "20";
            }
            String dateOfBirth = beginingOfYear + symbolsInPN[1] + symbolsInPN[2] + "/"
                    + symbolsInPN[3] + symbolsInPN[4] + "/"
                    + symbolsInPN[5] + symbolsInPN[6];
            SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
            formater.setLenient(false);
            try {
                Date annyDate = formater.parse(dateOfBirth);
                validationOf2to7Digits = true;
            } catch (Exception e) {
                validationOf2to7Digits = false;
            }

            // Ar teisingas paskutinis AK skaicius?
            int countedLastDigit = 0;

            int sum = 0;
            for (int i = 0; i <= 8; i++) {
                sum += numbersInPN[i] * (i + 1);
            }
            sum += numbersInPN[9];
            if (sum % 11 != 10) {
                countedLastDigit = sum % 11;
            }
            if (countedLastDigit == 0) {
                sum = 0;
                for (int i = 0; i <= 6; i++) {
                    sum += numbersInPN[i] * (i + 3);
                }
                for (int i = 7; i <= 9; i++) {
                    sum += numbersInPN[i] * (i - 6);
                }
                if (sum % 11 != 10) {
                    countedLastDigit = sum % 11;
                }
            }
            validationOfControlNumber = countedLastDigit == numbersInPN[numbersInPN.length - 1] ? true : false;

            if (validationOfLengthAndSymbols && validationOfFirstDigit
                    && validationOf2to7Digits && validationOfControlNumber) {
                System.out.println("Personal number is VALID.");

            } else {
                System.out.println("Personal number is NOT VALID.");
            }
        }
    }
}