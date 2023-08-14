package TiposCoringa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Program00 {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
    }
    List<String> myStrs = Arrays.asList("Mary","Carl","Felix");
    public static void printList(List<?> list) {//todo: o "?" ele e o tipo coringa ele e um tipo generico que e supertipo de qualquer tipo de lista;
                                                //todo: pode ser usado para fazer os metodos receberem qualquer tipo ex: int,String e por ai vai;
                                                //todo: Não e possivel adicionar dados a listas Coringa, ex usar o add.;
        List<String> myStrs = Arrays.asList("Mary","Carl","Felix");
        for (Object obj : list) {
            System.out.println(obj);
            System.out.println(myStrs);
        }
    }
}