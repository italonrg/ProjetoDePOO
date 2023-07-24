package Exercicios.Resolvidos.exercicioFuncionario;

public class Ufuncionario01 {
    private    String nome ;
    private int idade;
    private double [] salario;
    private double media = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {//para negar acesso a uma variavel pode-se não colocar o set e deixar o atributo como privado
        this.media = media;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);

        for (double salario : salario){
            System.out.println(salario+" Este são os salaros>>>>>");
        }
    }

    public void imprimeMedia(){/// não há nessecidade de passar parametros pois estamos dentro do proprio objeto
       /// aqui se inicia com 0 pois estamos dentro metodo e não tem valor de inicialização

        for (double salarrio : salario){///aqui >>salarrio<< está recebendo a variavel "salario"
            media+=salarrio;///aqui media esta recebendo "salarrio" que contem a variavel salario
            ///media que foi inicializada com 0 foi somada a todos os valores que salario possuia os valores dos arreios
        }
        media /= salario.length;///note que media vai ser dividida pelo numero total de posiçãoes dos arreios
        ///aqui media recebe salario.lenght pois e uma arreio//esse ponto.lenght serve para usar o total de qualquer coisa
        //imagine que o arreio tivesse 30 ou 50 possições , logo teria que definir manualmente isso funcionaria mas o codigo não fica escalavel pois
        //a divião nesse caso e feita a partir da quantidade de posições do arreio.
        System.out.println(" A media de salarios e : "+media);
    }
}
