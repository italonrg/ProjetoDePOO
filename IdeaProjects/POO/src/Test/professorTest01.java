package Test;
import Model.professor;

public class professorTest01 {
    public static void main(String[] args) {

        professor Professor = new professor();
        Professor.salario=3000;
        Professor.nome="Jailson";
        Professor.CPF= "789.656.123-00";

        System.out.println(" O CPF "+Professor.CPF+" O nome "+Professor.nome+Professor.sexo);
    }
}
