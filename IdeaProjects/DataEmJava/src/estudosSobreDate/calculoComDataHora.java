package estudosSobreDate;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculoComDataHora {
    public static void main(String[] args) {
        LocalDate D04 = LocalDate.parse("2022-09-20");

        LocalDateTime D05 = LocalDateTime.parse("2002-01-12T03:22:26.4578");

        Instant D06 = Instant.parse("2022-09-20T03:22:26.7894Z");

        Instant D007 = Instant.parse("2022-09-20T03:22:26.+01:00");

        LocalDate D08 = LocalDate.now();

        LocalDate PastWeak = D04.minusDays(12);
        LocalDate NextWeak = D04.plusDays(12);
        System.out.println(PastWeak);
        System.out.println(NextWeak);

        LocalDateTime PastWeak01 = D05.minusDays(12);//Diminuir HOras
        LocalDateTime NextWeak02 = D05.plusHours(12);//Acrecentar HOras
        System.out.println(PastWeak01);
        System.out.println(NextWeak02);


        Duration T1 = Duration.between(D08,D04) ;/// PARA calcular a duração de tempo;
        System.out.println(T1.toDays());
    }
}
