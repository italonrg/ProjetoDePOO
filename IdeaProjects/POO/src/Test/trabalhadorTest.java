package Test;
import classesAbstratas.atendente;
import classesAbstratas.gerente;
import classesAbstratas.supervisor;
import classesAbstratas.trabalhador;
import enumeracao.tipoPagamento;

public class trabalhadorTest {
    public static void main(String[] args) {

        gerente gerente00 = new gerente("Dunga",3000.0);
       supervisor supervisor00 = new supervisor(" Drew",4500.0);
        atendente atendente00 =new atendente(" Joana",1200);

        System.out.println(gerente00);

        System.out.println("----------------");



        System.out.println(supervisor00.toString());//desnecessario
        System.out.println("------------------");
        System.out.println(gerente00.calculaBonus());
        System.out.println("---------------------");
        System.out.println(supervisor00.calculaBonus());
        System.out.println("-------------------------");
        System.out.println(gerente00.calculaBonus());
        System.out.println(gerente00);
        System.out.println(supervisor00);
    }
}
