package Set;

import java.util.HashSet;
import java.util.Set;

public class SetTesteDeIgualdade {
    public static void main(String[] args) {

        Set<product> xxx = new HashSet<>();

        xxx.add(new product("TV",4.500));
        xxx.add(new product("notebook",12.500));
        xxx.add(new product("Maggot",789.500));
        xxx.add(new product("Sun",44444.500));

        product Product = new product("Moon",646.78);
        product Productxxx = new product("Sun",44444.500);

        System.out.println(xxx.contains("Moon"));//todo: antes de ter colocado o HashCode/Equals;
        System.out.println(xxx.contains(Productxxx));//todo: conferencia por conteudo e não por objeto;
    }//todo: Pq deu false ???: pq como não tem os Hashcode e o Equals , ele usa como parametro os "ponteiros" as referncias de memoria no caso "Moon" foi instanciado fora da lista "xxx";
}
