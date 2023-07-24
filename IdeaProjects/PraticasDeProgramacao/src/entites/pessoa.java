package entites;

public class pessoa {
     private int idade;

     private char sexo;
     private String nome;

     private double altura;
     private double peso;

     public double IMC(){

         double imc;
         imc = peso / (altura * altura);

       if ( imc <=18.5){
           System.out.println("Abaixo do peso normal");
       } else if (imc <=25) {
           System.out.println(" Peso normal");
       } else if (imc<=30) {
           System.out.println(" acima do peso normal");
       }else if (imc >30){
           System.out.println(" Obesidade");

       }return imc;
     }

    @Override
    public String toString() {
        return "pessoa{" +
                "idade=" + idade +
                ", sexo=" + sexo +
                ", nome='" + nome + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }

    public int idade() {
        return idade;
    }

    public pessoa setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public char sexo() {
        return sexo;
    }

    public pessoa setSexo(char sexo) {
        this.sexo = sexo;
        return this;
    }

    public String nome() {
        return nome;
    }

    public pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public double altura() {
        return altura;
    }

    public pessoa setAltura(double altura) {
        this.altura = altura;
        return this;
    }

    public double peso() {
        return peso;
    }

    public pessoa setPeso(double peso) {
        this.peso = peso;
        return this;
    }

    public pessoa(int idade, char sexo, String nome, double altura, double peso) {
        this.idade = idade;
        this.sexo = sexo;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }
}
