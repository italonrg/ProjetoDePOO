package Program;

import javax.xml.stream.events.Comment;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class aplication {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        comntarios c01 = new comntarios(" that's nice");
        comntarios c02 = new comntarios(" wow very nice");
        comntarios c03 = new comntarios(" Carrot , carrot");

        post p01 = new post(sdf.parse("12/03/2023")," mega do",12);
        post p02 = new post(sdf.parse("15/03/2023")," fumo de corda",5552);
        post p03 = new post(sdf.parse("22/04/2023")," n mesmo",212);

        p01.ADDcomennt(c01);
        p02.ADDcomennt(c02);


        System.out.println(p01);
        System.out.println(p02);
        System.out.println(p03);
    }
}
