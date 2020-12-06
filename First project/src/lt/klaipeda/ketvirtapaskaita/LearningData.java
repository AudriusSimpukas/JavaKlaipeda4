package lt.klaipeda.ketvirtapaskaita;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LearningData {
    public static void main(String[] args) {

        LocalTime laikas = LocalTime.now();
        System.out.println("Time is--- " + laikas);
        System.out.println(laikas.getHour());
        System.out.println(laikas.getMinute());
        System.out.println(laikas.getSecond());
        System.out.println(laikas.plusHours(2).withNano(0));
        System.out.println(laikas.minusMinutes(20).withSecond(0).withNano(0));
        System.out.println(laikas.withHour(0).withMinute(0).withSecond(0).withNano(0));

        LocalDate data = LocalDate.of(1981,Month.MARCH,16);
        System.out.println(data.minusYears(10));
        System.out.println(data.atTime(14,25));
        System.out.println(data.getYear());
        System.out.println(data.format(DateTimeFormatter.BASIC_ISO_DATE));

        LocalDateTime laikasIrData = LocalDateTime.now();
        System.out.println(laikasIrData);
    }
}
