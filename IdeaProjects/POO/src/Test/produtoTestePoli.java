package Test;
import Util.calculadoraImposto;
import polimorfismo.computador;
import polimorfismo.notebook;
import polimorfismo.produto;
import polimorfismo.tomate;

import java.util.ArrayDeque;
import java.util.ArrayList;


public class produtoTestePoli {
    public static void main(String[] args) {

       /* tomate tomate00 = new tomate("cereja",1.20);
       /*
        computador computador00 = new computador("pcdaXUXA",5.000);
        */

        produto tomate = new tomate("cereja",1.50);
        produto computador = new computador("Ryzen 9",5.000);
        tomate TOmate = new tomate("hjkhk",4587);
        TOmate.data();

        ///isso e o polimorfismo
        System.out.println(tomate);
        System.out.println(computador);
        produto Notebook = new notebook("Dell inspiron 15",2500);

        produto notebook = new notebook("dell 25",5460);
        System.out.println(notebook.calcularImposto());
        System.out.println(Notebook.calcularImposto());
/* essa instancia de produto e de uma classe mais generica para uma mais especializada
        //contrario também ocorre;
        /*
        if ( produto instanceof notebook) {
            notebook Note = (notebook) produto;     }
*/

    }
}
