package classesAbstratas;

public abstract class trabalhador extends imprime {
/* a funcionalidade de ũma classe abstrate e se estendida
* e ela não pode ser instanciaada ou seja não pode colocar o new ;*/
    protected String nome;
    protected  double salario;

    @Override
    public String toString() {
        return "trabalhador{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public abstract double calculaBonus();
    //metodos abstrato so podem existir em classes abstratas;nunca em uma classe concreta
    // Classes abstratas podem metodos abstratos e concretos;
    public trabalhador(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

}
