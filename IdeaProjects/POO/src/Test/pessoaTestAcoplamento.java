package Test;

import Model.pessoa;

public class pessoaTestAcoplamento {
    public static void main(String[] args) {

        pessoa PessoaTeste = new pessoa();
        //PessoaTeste.nome = "Italo";
        //PessoaTeste.altura = 1.75;
        //PessoaTeste.peso = 80.1245;
        //PessoaTeste.sexo = 'M';
        //PessoaTeste.idade = 28;
        /*Acoplamento e  como o get e set são chamados ele quer dezer quanto que uma classe esta relacionada com a outra
        * */

        PessoaTeste.setAltura(1.75);
        PessoaTeste.setNome("Italo Rafael");
        PessoaTeste.setSexo('M');
        PessoaTeste.setIdade(28);
        PessoaTeste.setPeso(85.789);

        System.out.println(" Impressão da variavel :::: "+PessoaTeste.getNome());
        System.out.println(PessoaTeste.getAltura());
        System.out.println(PessoaTeste.getPeso());
        System.out.println(PessoaTeste.getIdade());
        System.out.println(PessoaTeste.getSexo());
        PessoaTeste.Imprime();


    }
}
