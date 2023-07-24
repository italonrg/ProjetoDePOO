package Test;

import heranca.enderecoHerenca;
import heranca.funcionarioHeranca;
import heranca.pessoaHeranca;

public class heracaTest {
    public static void main(String[] args) {
        enderecoHerenca EnderecoVarR = new enderecoHerenca();
        EnderecoVarR.setRua("Rua Flex Power");
        EnderecoVarR.setCep("71-00000");

        pessoaHeranca PessoaVarR = new pessoaHeranca("Jeux");
        PessoaVarR.setNome("Amicia");
        PessoaVarR.setCPF("978645312-12");
        //PessoaVarR.setEndereco("San Moritz");
        PessoaVarR.imprime();
        funcionarioHeranca FuncionarioVaR = new funcionarioHeranca(5.0000D);

        FuncionarioVaR.setCPF("3216978-78");
        FuncionarioVaR.setNome(" José Santorio");
        FuncionarioVaR.setSalario(7.23000D);
        /*
         * E deveras indicado usar a herança apenas quando se quiser estender as
         * funcionalidades de uma classe ou usar o polimorfismo.
         * */
        System.out.printf("----------------------");
        FuncionarioVaR.imprime();
        PessoaVarR.imprime();
        System.out.println("------------------------");
        PessoaVarR.toString();
    }
}
