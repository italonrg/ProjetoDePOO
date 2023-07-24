package estudosSobreDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class aula110 {
    public static void main(String[] args) {



        DateTimeFormatter Fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        LocalDate D01 = LocalDate.now();


        LocalDateTime D02 = LocalDateTime.now();

        Instant D03 = Instant.now();

        LocalDate D04 = LocalDate.parse("2022-09-20");

        LocalDateTime D05 = LocalDateTime.parse("2022-09-20T03:22:26.4578");

        Instant D06 = Instant.parse("2022-09-20T03:22:26.7894Z");

        Instant D07 = Instant.parse("2022-09-20T03:22:26.7894-03:00");

        LocalDate D08 = LocalDate.parse("04/07/2023",Fmt01);
        LocalDate D09 = LocalDate.parse("04/07/2023 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate D10 = LocalDate.of(1996,03,15);
        LocalDateTime D11 = LocalDateTime.of(1996,03,15,02,36,0006,87454);


        System.out.println(D01);
        System.out.println(D02);
        System.out.println(D03);
        System.out.println(D04);
        System.out.println(D05.toString());
        System.out.println(D06.toString());
        System.out.println(D07.toString());
        System.out.println(D07.toString());
        System.out.println(D08.toString());
        System.out.println(D09.toString());
        System.out.println(D10.toString());
        System.out.println(D11.toString());



    }



}
