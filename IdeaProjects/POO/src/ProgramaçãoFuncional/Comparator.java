package ProgramaçãoFuncional;

import java.util.ArrayList;
import java.util.List;

public class Comparator<P> {
    public static void main(String[] args) {
        List<ProductLambida> list = new ArrayList<>();
        list.add(new ProductLambida("tv",9000.00));
        list.add(new ProductLambida("radio",9000.00));
        list.add(new ProductLambida("sofá",9000.00));
        list.add(new ProductLambida("cama",9000.00));

        //todo:fazendo e impementand uma classe anonima;
       

        list.sort(new MinhaaComparações());
    }




}
