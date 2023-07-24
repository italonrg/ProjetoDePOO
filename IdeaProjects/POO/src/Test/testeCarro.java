package Test;

import Model.carro;
import Model.estudante;

public class testeCarro {
    public static void main(String[] args) {
        carro caoort = new carro();
        carro carroy = new carro();

        caoort.ano=2003;
        caoort.modell ="Compacto";
        caoort.mome="Felrzer";

        carroy.mome="Corsky";
        carroy.modell ="Muscle";
        carroy.ano=1973;

        //estudante EstudanteComprarCarro = new estudante();
        //EstudanteComprarCarro.idade=21;



        System.out.println("----"+caoort.mome+"---"+caoort.modell +"----"+caoort.ano);
        System.out.println("----"+carroy.mome+"---"+carroy.modell +"----"+carroy.ano);

    }
}
