package estudosSobreDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class AnotherClass {
    public static void main(String[] args) {
        LocalDate D04 = LocalDate.parse("2022-09-20");

        LocalDateTime D05 = LocalDateTime.parse("2022-09-20T03:22:26.4578");

        Instant D06 = Instant.parse("2022-09-20T03:22:26.7894Z");

        LocalDate R1 = LocalDate.ofInstant(D06,ZoneId.systemDefault());
        LocalDate R2 = LocalDate.ofInstant(D06,ZoneId.of("America/Rosario"));
        LocalDate R3 = LocalDate.ofInstant(D06,ZoneId.of("Portugal"));
        System.out.println(R1);
        System.out.println(R2);
        System.out.println(R3);

        System.out.println(" dia de D04="+ D04.getDayOfMonth());
        System.out.println(" mes do ano de D05="+D05.getMonth());
        System.out.println(" mes do ano de D04="+D04.getMonth());
        System.out.println(" mes do ano de D05="+D05.getHour());
    }
}
