package exception.aplication;
import exception.exepoinPacks.EXx;
import exception.model.resevation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws ParseException  {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
try {
            System.out.println(" Room number : ");
            int number = sc.nextInt();
            System.out.println(" Check-in date : (dd/mm/yyyy) : ");
            Date checkInn = sdf.parse(sc.next());

            System.out.println(" Check-out date : (dd/mm/yyyy) : ");
            Date checkOtt = sdf.parse(sc.next());


            resevation Reserva01 = new resevation(number, checkInn, checkOtt);
            System.out.println(" Reserva : " + Reserva01);


            Reserva01.updateDates(checkInn, checkOtt);
            System.out.println(" Diga a atualização da reserva: " + Reserva01);
} catch (EXx e) {

    throw new EXx("Invalid Date format##");
}catch (RuntimeException e ){
    System.out.println(" Erro insperado!!!");
    //todo:fazer um cath generico da classe Runtime , para qualquer outro erro , que possa acontecer;
}

    }

}

