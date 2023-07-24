package program;

import java.util.Scanner;

public class program {

    public static final double pi = 3.14159;

    public static void main(String[] args) {
       /// esse final diz que ele esse variavel não muda.
        /// menbros estaticos ; ele funciona independente de objetos.
        ///exemplo de Math.sqrt ela e uma classe

        ///versão 01
        Scanner sc = new Scanner(System.in);
        System.out.println(" entre com o raio");
        double radius = sc.nextDouble();

        double c = circumference(radius);
        double v = volume(radius);

        System.out.println(" a circunferencia e :" + c);
        System.out.println(" a circunferencia e :" + v);
        System.out.println(" a circunferencia e :" + pi);
    }

    public static double circumference(double radius) {
        return 2.0 * pi * radius;
    }

    public static double volume(double radius) {
        return 4.0 * pi * radius * radius * radius / 3.0;
    }

    public class triangulo {////??????
        int raio;// atributos
        int diametro;
    }
   

}