import cosntrutor.pessoa;
import cosntrutor.endereco;

public class Main {
    public static void main(String[] args) {
        pessoa p1 = new pessoa("Italo","85968876522");
        pessoa p2 = new pessoa();

        p2.nome = "Paula";
        p2.CPF = "78945612312";

        System.out.println(p1.nome+p1.CPF);
        System.out.println(p2.nome+p2.CPF);

        //endereco

        endereco e1 = new endereco();
       e1.bairro = "Ceilândia";
       e1.logradouro = "????";
       e1.cep = "72214-12";
       e1.numero= "789";
       e1.cidade= "Brasilía";
       e1.complemento= "????";

       endereco e2 = new endereco();
        e2.bairro = "Ceilândia";
        e2.logradouro = "????";
        e2.cep = "72214-12";
        e2.numero= "789";
        e2.cidade= "Brasilía";
        e2.complemento= "????";


        System.out.println(e1.bairro+e1.numero+e1.logradouro+e1.cep+e1.cidade+e1.complemento);
        System.out.println(e2.bairro+e2.numero+e2.logradouro+e2.cep+e2.cidade+e2.complemento);

    }
}