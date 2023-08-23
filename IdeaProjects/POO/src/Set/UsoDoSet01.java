package Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UsoDoSet01 {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));//todo: o asList e para já passar o arreio na declaração;
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
//union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);
//intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);
//difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);


        Set<String> XXX = new TreeSet<>(Arrays.asList("mary","Jonas","Amicia","Hugo","Anna"));//todo: Estes são os arreios que serão unidos XXX/PPP;
        Set<String> PPP = new TreeSet<>(Arrays.asList("Carrot","Potato","Garlic","Banana","Apple"));

        //todo: fazendo uma uniaão entre os elementos;

        Set<String> UNION00 = new TreeSet<>(XXX);//todo: aqui eu crio uma variavel que recebe um novo objeto que recebe o XXX que e um arreio;
        UNION00.addAll(PPP);//TODO: Aqui a lista PPP recebe tudo que a lista XXX tem;
        System.out.println(UNION00);//todo a varivael UNION00, serve para eu trabalhar com as duas listas;

        //todo:fazendo uma interceção;

        Set<String> DDD = new TreeSet<>(Arrays.asList("mary","Jonas","Amicia","Hugo","Anna","Apple"));
        Set<String> RRR = new TreeSet<>(Arrays.asList("Carrot","Potato","Garlic","Banana","Apple"));

        Set<String> INTER00 = new TreeSet<>(DDD);//todo: o que o retailAll faz: adiciona todos que são iguais a lista;
        INTER00.retainAll(RRR);
        System.out.println(INTER00);

        //todo: fazendo uma diferença;

        Set<String> III = new TreeSet<>(Arrays.asList("mary","Jonas","Amicia","Hugo","Anna","Apple"));
        Set<String> VVV = new TreeSet<>(Arrays.asList("Carrot","Potato","Garlic","Banana","Apple"));

        Set<String> DIFER = new TreeSet<>(III);
        DIFER.removeAll(VVV);//todo: Remove todos os diferentes da lista;

    }
}
