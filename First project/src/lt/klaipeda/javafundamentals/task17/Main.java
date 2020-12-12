package lt.klaipeda.javafundamentals.task17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, insert next course date:");

        String insertedDate = input.nextLine();

//        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        String formatedInsertedDate = String.format(insertedDate, formattedDate);

        LocalDate dayOfTheCourse = LocalDate.parse(insertedDate);
        LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.DAYS.between(today, dayOfTheCourse));

    }
}
