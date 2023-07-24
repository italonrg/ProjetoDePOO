package application;
import entities.triangle;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        triangle x,y;

        x= new triangle();///o x aqui ele e um objeto ! por isso ele e uma instancia da classe
        y= new triangle();///o y aqui ele e um objeto ! por isso ele e uma instancia da classe
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("entre com os lados x do triangulo:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os lados y do triangulo");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areax = x.area();
        double areay = y.area();

        System.out.printf("triangulo x area : %.4f%n", areax);
        System.out.printf("triangulo y area : %.4f%n", areay);

        if (areax > areay) {
            System.out.println("area x e maior !!!");
        } else {
            System.out.println("area y e maior !!!");

            sc.close();

        }
    }
}