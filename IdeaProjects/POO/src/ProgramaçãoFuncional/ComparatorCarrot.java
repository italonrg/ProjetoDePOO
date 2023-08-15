package ProgramaçãoFuncional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorCarrot {//todo: Co1mparator e uma interface funional do Java 8;

    public static int CompareProductsTestFuncao( ProductLambida p7 , ProductLambida p8){
        return p7.getPrice().compareTo(p8.getPrice());//todo: No caso eu vou chamar essa função dentro de outra função, list.sort, vide abaixo;
        //todo: Na programação funcional e possivel que uma função receba a outra como argumento, e até que ela seja retornada;Isso e o que se chama de Primeira ordem;

    }
    public static void main(String[] args) {
        List<ProductLambida> list = new ArrayList<>();
        list.add(new ProductLambida("tv",9000.00));
        list.add(new ProductLambida("radio",9000.00));
        list.add(new ProductLambida("sofá",9000.00));
        list.add(new ProductLambida("cama",9000.00));

        //todo:fazendo e impementand uma classe anonima;Note que aparentimente uma interface pode ser chamada dentro de uma classe, sem que seja criada uma pagina so pra ela;

        Comparator<ProductLambida> comp = new Comparator<ProductLambida>() {
            //todo:"Comp" e uma variavel que e um objeto(new) do tipo Comparartor Product//Obs: Meio que deu certo o Comaparator, apesar de que não acho que esteja 100% certo;
            @Override
            public int compare(ProductLambida p1 , ProductLambida p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }

        };
        list.sort(comp);
        //todo: List, tem varias opções de comparação incluindo o sort que por sua vez e um mecanismo de ordenação/tem outros da classe comparable que faz comparações;

        //todo: Criando uma expreção Lambida;essa setinha -> significa levando a, noa caso a implentação do que estiver em parenteses;
        Comparator<ProductLambida> comp01 = ( p3 ,p4) -> {
            return p3.getPrice().compareTo(p4.getPrice());
        };
        list.sort(comp01);
        //todo : Expressões lambida podem ser passadas como argumntos já direto Ex:
        list.sort((p5 , p6) -> p5.getName().compareTo(p6.getName().toUpperCase()));

        list.sort(ComparatorCarrot::CompareProductsTestFuncao);//todo: Deu certo :)


        for (ProductLambida XXX : list){
            System.out.println(XXX);
        }
    }



}
