package ProgramaçãoFuncional.Predicate;

import ProgramaçãoFuncional.ProductLambida;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AprendizadoPredicate {
    public static void main(String[] args) {
        //todo: ex removeIf;

        List<ProductLambida> list01 = new ArrayList<>();

        list01.add(new ProductLambida("tv",9000.00));
        list01.add(new ProductLambida("mouse",90.00));
        list01.add(new ProductLambida("Computer",12000.00));
        list01.add(new ProductLambida("Laptop",2000.00));
        list01.add(new ProductLambida("Fork",9.00));
        list01.add(new ProductLambida("Orange",1.00));
        list01.add(new ProductLambida("case",100.0));

        //todo: Removendo da lista todos que tem o valor meno ou igual a 100;

        list01.removeIf( XVIII -> XVIII.getPrice() >=100 );


        for ( ProductLambida XXX : list01){
            System.out.println(XXX);
        }
        System.out.println("----------------------------------");

        List<ProductLambida> list02 = new ArrayList<>(list01);//todo: Aqui para não escrever de novo eu adicionei a lista01 , na lista02;)

        //list02.removeIf(new PredicateProduct());//todo: Essa a forma em que se instancia um objeto de uma classe que implementa uma interface que tem o metodo"PredicateProduct;
        //list02.removeIf(ProductLambida::StaticPredicateProduct);//todo: Esquema do reference method quando se chama a classe e "::" nome do metodo dela;
        //list02.removeIf(ProductLambida::NonStaticPredicateProduct);
        //todo: Predicado com expressão Lambida in-line, ou sejá direto;

        //todo: tambem pode se obter os valores de variaveis e de inpusts do ususario;
        Scanner entrada = new Scanner(System.in);
        //double DFG = entrada.nextDouble();//todo:ImputMismathExepition, ou seja esta dando erro mas e so a titulo de anaotação;

        //ProgramaçãoFuncional.Predicate<ProductLambida> Pred = P -> P.getPrice() >= DFG;


        for (ProductLambida XXC : list02){
            System.out.println(XXC);
        }
        for (ProductLambida D : list01){
            System.out.println(D);
        }
    }
}
