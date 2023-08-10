package interfacesNA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(" Entre com os dados das parcelas : ");
        System.out.println(" Numero :");
        int number = sc.nextInt();
        System.out.println(" Digite a data ");
        LocalDate dataAtual = LocalDate.parse(sc.next(),fmt);
        System.out.println(" Entre com o valor do contrato:");
        double totalValue = sc.nextDouble();

        contract Contrato001 = new contract(number,dataAtual,totalValue);

        System.out.println(" Entre com o numero de parcelas : ");
        int numeroParcelas = sc.nextInt();
    }
}
