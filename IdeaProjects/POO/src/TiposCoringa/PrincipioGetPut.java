package TiposCoringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrincipioGetPut {
    List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
    List<Double> myDoubles = Arrays.asList(3.14, 6.28);
    List<Object> myObjs = new ArrayList<Object>();

   // copy(myInts, myObjs);
   // copy(myDoubles, myObjs);


    public static void copy(List<? super Number> source, List<Object> destiny) {

        for (Object number : source){
            destiny.add(number);
        }

    }
    public static void printList(List<?> list){//todo: o sinal ?, serve para "Dizer que dali pode sair uma lista de qualquer tipo"; O for e para percorrer toda a lista e fazer o que se quer
        for ( Object XXX : list){
            System.out.println(XXX + " -- ");
        }
    }
}




