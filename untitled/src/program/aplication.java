package program;
import entities.worker;
import entities.worklevel;
import entities.hourContract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class aplication {
    public static void main(String[] args) throws ParseException {

       // SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.printf("Entre com o departamento");
        String departmentName = sc.nextLine();
        System.out.printf(" entre com o nome :");
        String workName = sc.nextLine();
        System.out.printf(" qual seu level:");
        String levelName = sc.nextLine();
        System.out.printf(" qual salario base:");
        String BaseSALARY = sc.nextLine();

        worker Worker = new worker(workName,worklevel.JUNIOR,BaseSALARY,departmentName);

        System.out.printf("Quantos contratos o trabalhador tem ???");
        int quantidadeContrato = sc.nextInt();
        for (int i = 0; i < quantidadeContrato; i++) {
           // System.out.printf("Entre com o numero de contratos #" + i + "data:");
           // System.out.printf(" Data : (DD/MM/YYYY");
            System.out.println(" digite qualquer numero pra se a data:de");
            //Date contratoData = sfd.parse(sc.nextLine());

            double valorPorhora = sc.nextDouble();

            System.out.printf(" Duração do do contrato???");
            int horas = sc.nextInt();

            hourContract Contracto = new hourContract( valorPorhora,horas);
            Worker.addContract(Contracto);
        }

        System.out.printf("------------------------");
        System.out.printf(" Entre com o mes e o ano de salario se la:");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println( " nome do funcionario : "+Worker.getName());
        System.out.println(" departemento :"+Worker.getDepartment());
        System.out.println(" income for :"+mesEAno+" : "+Worker.income(ano,mes));
    }



}

