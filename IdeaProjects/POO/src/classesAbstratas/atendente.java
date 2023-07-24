package classesAbstratas;

public class atendente extends trabalhador {
    public atendente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprime() {

    }

    @Override
    public double calculaBonus() {
        return 0;
    }

    @Override//esse metodo e concreto e pois ele não e abstrato.
    public String toString() {
        return "atendente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

}
