package Exercicios.Resolvidos.exercicioFuncionario;

import java.util.Scanner;

public class funcionarios {

    Scanner entrada01 = new Scanner(System.in);

    public   String nome ;
    public int idade;
    public double salarioMes01;
    public double salarioMes02;
    public double salarioMes03;

    String teste =entrada01.nextLine();

    ///Metodos

    public void testeee(){
        System.out.println("Digite algo>>>>>>>");
        System.out.println(teste);
    }
    public void imprimirDados(){

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Digite seu nome:");
        nome= entrada.nextLine();
        System.out.println(this.nome);

        System.out.println(" Digite sua idade:");
        idade = entrada.nextInt();
        System.out.println(this.idade);

        System.out.println(" Digite o salario do mes 01:");
        salarioMes01 = entrada.nextDouble();
        System.out.println(this.salarioMes01);

        System.out.println(" Digite o salario do mes 02:");
        salarioMes02 = entrada.nextDouble();
        System.out.println(this.salarioMes02);

        System.out.println(" Digite o salario do mes 3:");
        salarioMes03 = entrada.nextDouble();
        System.out.println(this.salarioMes03);
    }

    public double TirarMediaDeSalario(){
            double media = salarioMes01+salarioMes02+salarioMes03/3;
            return media;
    }

}
 