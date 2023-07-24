package classesAbstratas;

public class gerente extends trabalhador {

    public gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        this.salario = salario+ salario*0.3;
        return 0;
    }

    @Override
    public void imprime() {

    }

    @Override
    public String toString() {
        return "gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
