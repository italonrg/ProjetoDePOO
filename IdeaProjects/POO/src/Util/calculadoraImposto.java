package Util;
import polimorfismo.computador;
import polimorfismo.tomate;
import polimorfismo.produto;
public class calculadoraImposto {

    public static void calcularIpostoComputador(computador Computador) {
        System.out.println(" Relatorio de imposto computador:");
        double imposto = Computador.calcularImposto();
        System.out.println(" imposto do computador :" + Computador.valor());
        System.out.println(" Nome do computador" + Computador.nome());
        System.out.println(" Valor do Computador" + Computador.valor());


    }

    public static void calcularIpostoTomate(tomate Tomate) {
        System.out.println(" Relatorio de imposto computador:");
        double imposto = Tomate.calcularImposto();
        System.out.println(" imposto do computador :" + Tomate.valor());
        System.out.println(" Nome do computador" + Tomate.nome());
        System.out.println(" Valor do Computador" + Tomate.valor());
    }


}