package classesAbstratas;

public class supervisor extends trabalhador{
    @Override
    public String toString() {
        return "supervisor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public supervisor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprime() {

    }

    @Override
    public double calculaBonus() {
        this.salario = salario+ salario*0.5;
        return salario;
    }
}
