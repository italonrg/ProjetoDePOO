package Map;

import java.util.Map;
import java.util.TreeMap;

public class MapAprendizado {
    public static void main(String[] args) {

        Map<String , String> cookies = new TreeMap<>();//todo:TreeMap ordena por ordem alfabetica;
        cookies.put(" Username","mary");//todo:Username e a chave e maria e o valor; K/V;quando quiser saber o valor e so chamar a chave;
        cookies.put("Username"," Anna");
        cookies.put("Email"," Anna@annagmail.com");
        cookies.put("phone","(61)9 98809648");
        cookies.remove("Email");
        cookies.put("phone","(89) 9 8978451");//todo:chaves com nomes iguais e valores diferentes, ocorrre que o valor sequente e sobreescrito;

        for ( String key : cookies.keySet()) {//todo: Mostra todas as chaves;PS: valueSet mostra todos os valores;
            System.out.println(" Todas as chaves ="+" "+key+" "+ cookies.get(key));
        }
        System.out.println("Phone number: "+cookies.get("phone"));
        System.out.println(cookies.values());
        System.out.println(cookies.size());
    }
}
