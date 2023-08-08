package MetodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aplicationShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/**/

        List<Shape> listaDeFormas= new ArrayList<>();


        System.out.println(" Entre com o valor de formas :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(" forma #" + i + " Data:");
            System.out.println(" Diga se e um retangulo ou um circulo (r/c)");


            char ch = sc.next().charAt(0);
            System.out.println(" cor : green , red , blue");
            color Color = color.valueOf(sc.next());
            /*
             * Aqui no caso eu chaei a classe color e , dei a ela uma variavel Color , passei o valueof ,
             * que atribui a classe color o que eu digitar e , no caso atribuindo o que o usuario digitar!!!
             *
             *
             *
             *
             *
             *
             *
             *
             *
             *
             * */
            if (ch == 'r') {
                System.out.println(" Digite a altura e a largurax:");
                double largurax = sc.nextDouble();
                double altura = sc.nextDouble();
                listaDeFormas.add(new retangle(altura, largurax, Color));//aqui na lista ao inves de passar os valores direto passei as variaveis;
            } else {
                System.out.println(" Digite o raio :");
                double radio = sc.nextDouble();
                listaDeFormas.add(new circle(radio));/// aqui ele adiciona o que foi digitado a lista;

            }
        }
        System.out.println("--------------------------");
        for ( Shape sph : listaDeFormas){
            System.out.println(sph.area());//eu tava tentando usar a classe Shape para chamar o metodo mas tem que usar a variavel que controla o laço o "for";
        }
        sc.close();
    }
}
