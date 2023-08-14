package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsoDoSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();//todo: Hasset e rapido mas não garante a odem dos elementos;
        Set<String> set01 = new TreeSet<>();//todo: Lento mas garante que os elementos sejam ordenados;
        Set<String> set02 = new LinkedHashSet<>();//todo: Um pouco dos dois;

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        set01.add("Carrot");
        set01.add("Main");
        set01.add("Joule");

        set02.add(" Maggot");
        set02.add(" Mind");
        set02.add(" Master");


        set.remove("Notebook");
        set01.size();//todo:diz o tamanho da lista;
        set02.removeIf( x -> x.charAt(2)== 'i');//todo:nessa equaçãozinha diz que, se na podição 2 tiver um i o nome deve ser deletado;

        System.out.println(set.contains("Notebook"));//todo:mostra se tem o nome que vc passa como argumento();Nesse caso ele diz que não pq la ta em maiusculo;

        for (String p : set) {
            System.out.println(p);
        }
        System.out.println("----------");
        for (String x : set01){
            System.out.println(x);
        }
        System.out.println("--------------");
        for (String v : set02){
            System.out.println(v);
        }
    }
}
