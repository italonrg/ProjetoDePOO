package ProgramaçãoFuncional.Consumer;

import ProgramaçãoFuncional.ProductLambida;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AprendizadoConsumer {
    public static void main(String[] args) {

        List<ProductLambida> listConsumer = new ArrayList<>();

        listConsumer.add(new ProductLambida("tv",9000.00));
        listConsumer.add(new ProductLambida("mouse",90.00));
        listConsumer.add(new ProductLambida("Computer",12000.00));
        listConsumer.add(new ProductLambida("Laptop",2000.00));
        listConsumer.add(new ProductLambida("Fork",9.00));
        listConsumer.add(new ProductLambida("Orange",1.00));
        listConsumer.add(new ProductLambida("case",100.0));

        Consumer<ProductLambida> Houston = CCC -> {
            CCC.setPrice(CCC.getPrice()*12.9);
        };//todo: esse e o metodo já passando a expressão lambida;
        //listConsumer.forEach(new PriceUpdadeConsumer());//todo: o forEach percorre toda a lista como um for normal, aplicando o que está em parenrese;
        //listConsumer.forEach(ProductLambida::StaticPriceUpdate);
        listConsumer.forEach(ProductLambida::NonStaticPrice);
        listConsumer.forEach(System.out::println);//todo: com esse metodo de referencia "::" pode-se colocar quaquer classe do Java e passar uma de suas funções;

        System.out.println("------------------------");

        listConsumer.forEach(Houston);
        listConsumer.forEach(System.out::println);
        System.out.println("----------------------------");

        listConsumer.forEach( VVVV -> VVVV.setPrice(VVVV.getPrice()* 10000));
        listConsumer.forEach(System.out::println);
    }
}
