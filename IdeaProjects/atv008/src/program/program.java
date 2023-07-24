package program;

import entities.funcionario;

public class program {
    public static void main(String[] args) {

        funcionario x = new funcionario("maria", 100, 45);//instancias de funcionario
        funcionario y = new funcionario("carlos", 80, 15);

        double resultado =
        System.out.println(x.valorPago());
        System.out.println(y.valorPago());
    }

}


