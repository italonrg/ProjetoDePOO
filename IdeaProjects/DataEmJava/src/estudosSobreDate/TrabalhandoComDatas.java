package estudosSobreDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrabalhandoComDatas {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat DT01 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat DT02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date X1 = new Date();
        Date X2 = new Date(System.currentTimeMillis());

        Date y1 = DT01.parse("25/12/2023");
        Date y = DT01.parse("25/12/2023 22:45:59");
        System.out.println(DT02.format(y));
        System.out.println(DT01.format(y1));
        System.out.println(X1);
        System.out.println(X2);
    }
}
