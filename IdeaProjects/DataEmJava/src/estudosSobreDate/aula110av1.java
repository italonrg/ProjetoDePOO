package estudosSobreDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class aula110av1 {
    public static void main(String[] args) {


        LocalDate D04 = LocalDate.parse("2022-09-20");

        LocalDateTime D05 = LocalDateTime.parse("2022-09-20T03:22:26.4578");

        Instant D06 = Instant.parse("2022-09-20T03:22:26.7894Z");

        Instant D007 = Instant.parse("2022-09-20T03:22:26.+01:00");

        DateTimeFormatter FMT01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter FMT02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter FMT03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter FMT04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter FMT05 = DateTimeFormatter.ISO_INSTANT;

        System.out.println(D04.format(FMT01));
        System.out.println(D05.format(FMT02));
        System.out.println(D05.format(FMT01));
        System.out.println(FMT01.format(D04));
        System.out.println(FMT03.format(D06));
        System.out.println(FMT05.format(D06));

    }
}