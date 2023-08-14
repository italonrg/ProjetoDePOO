package Map.atividadeMap;

import java.util.HashMap;
import java.util.Map;

public class programMap {
    public static void main(String[] args) {

        Map< Product , Double> estoque = new HashMap<>();//todo: o map tambem funciona como o set, se não tem hashCode/Equals ele compara os objetos em memoria não o valor deles;

        Product p1 =new Product("Toy",14.45);//todo: valores e nomes do produto;
        Product p2 =new Product("Carrot",9.15);//Já o Map aqui esta servido para ver quantos tem em estoque
        Product p3 =new Product("Stream",989.45);

        estoque.put(p1,12112.2);
        estoque.put(p2,78778.2);
        estoque.put(p3,32356.2);

        Product ps = new Product("Toy",14.45);

        System.out.println(" Contem ps Key:"+estoque.containsKey(ps));
    }
}
