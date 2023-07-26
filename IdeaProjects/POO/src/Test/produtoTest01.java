package Test;
import polimorfismo.notebook;
import polimorfismo.produto;
import Util.calculadoraImposto;
import polimorfismo.computador;
import polimorfismo.tomate;

import java.util.ArrayList;
import java.util.List;

public class produtoTest01 {
    public static void main(String[] args) {

        /*
        * QUE FIQUE CLARO O QUE E A INSTANCIA (25/07/2023) : A INSTANCIA E
        * CRIAR UM NOVO OBJETO DA CLASSE COM O NEW !!! E APENAS CRIAR O OBJETO DA CLASSE!!!
        *
        * NO CASO DA CLASSE ABSTRATA , NÃO ESTÁ INSTANCIANDO , APENAS TENDO A REFERENCIA DA CLASSE
        *
        *
        *
        *
        *
        *
        *
        *
        * */
        computador Computador= new computador("pcdaXUXA",5.000);
        tomate Tomate = new tomate("cerja",10);


        produto t0010 = new tomate("cereja",500);
        System.out.println(t0010.calcularImposto());

        produto n0010 = new notebook(" acerNitro",4000);
        System.out.println(n0010.calcularImposto());

        List<produto> ListaDeProdutos = new ArrayList<>();
        ListaDeProdutos.add(new computador(" Dell001",1200));
        ListaDeProdutos.add(new notebook(" lenovo idapad",2000));
        ListaDeProdutos.add(new tomate(" amarelo",12));
        ListaDeProdutos.add(new notebook(" Dellvostro",1500));
        ListaDeProdutos.add(new computador(" alienware",1200));

        double somaDosProdutos = 0.0;
        for ( produto pro : ListaDeProdutos){
            somaDosProdutos +=pro.getValor();
        }
        System.out.println(" A soma de todos os produtos e : "+somaDosProdutos);
        System.out.println("----------------------------------------------------");
        for (produto pro01 : ListaDeProdutos){
            System.out.println(pro01.getNome()+" -- "+pro01.getValor()+"  -- "+pro01.calcularImposto());
        }
    }

}
