package ProgramaçãoFuncional.Funcion;

import ProgramaçãoFuncional.ProductLambida;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Function {
    public static void main(String[] args) {

        List<ProductLambida> list01 = new ArrayList<>();

        list01.add(new ProductLambida("tv",9000.00));
        list01.add(new ProductLambida("mouse",90.00));
        list01.add(new ProductLambida("Computer",12000.00));
        list01.add(new ProductLambida("Laptop",2000.00));
        list01.add(new ProductLambida("Fork",9.00));
        list01.add(new ProductLambida("Orange",1.00));
        list01.add(new ProductLambida("case",100.0));

        java.util.function.Function<ProductLambida , String> func = DF -> DF.getName().toLowerCase();
        //list01.stream().map(new UppercaseMethod()).collect(Collectors.toList());//todo:essa linha diz que para cada objeto da lista, será aplicado o Upercasemethod;
        //todo: e isso que o map faz;
        list01.stream().map(ProductLambida::TudoMaisculo).collect(Collectors.toList());
        list01.stream().map(ProductLambida::TudoMaiusculoGGGG).collect(Collectors.toList());
        //todo:Expressão lambida dentro do map;
        System.out.println("====================================");
        list01.stream().map(func).collect(Collectors.toList());
        list01.forEach(System.out::println);
    }
}
