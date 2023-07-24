package nascimento_Italo_maratonaJava.Core.Model.Test;
import nascimento_Italo_maratonaJava.Core.Model.Test.Model.Estudante;

public class estudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();// pode-se criar uma variavel , sem colocar o new mas para criar o objeto tem que colocar o new!
        /* "Estudante" e a classe , "estudante" a variavel , new Estudante o objeto! */
        estudante.idade=12;
        estudante.nome="ítalo";
        estudante.sexo='M';
        System.out.println(estudante.idade+estudante.idade+estudante.nome);
    }

}
