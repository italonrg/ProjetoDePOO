package Exercicios.Resolvidos.exercicioFuncionario;

import Exercicios.Resolvidos.exercicioFuncionario.Ufuncionario01;

public class UfuncionarioTest {
    public static void main(String[] args) {

        Ufuncionario01 funcionarioTeste = new Ufuncionario01();

        /*
        funcionarioTeste.nome = "Italo";
        funcionarioTeste.idade = 28;
        funcionarioTeste.salario = new double[]{2000,1455,7896};///quando for arreio tem que colocar dessa forma . para especificar que e uma arreio!
        funcionarioTeste.imprime();
        funcionarioTeste.imprimeMedia();
        */
        funcionarioTeste.setNome(" Ítalo Rafael");
        funcionarioTeste.getNome();

        funcionarioTeste.setIdade(99);
        funcionarioTeste.getIdade();
funcionarioTeste.setMedia(12000);

        funcionarioTeste.getSalario();
        funcionarioTeste.setSalario(new double[]{0x2e, 47, 233, 965, 1245, 1324, 6497, 6545, 6936, 8745});

        funcionarioTeste.imprimeMedia();
        funcionarioTeste.imprime();
    }
}
