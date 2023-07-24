package heranca;

public class funcionarioHeranca extends pessoaHeranca {
    private double salario;

    public void relatorioDePagamento(){
        System.out.printf(" Eu"+this.nome+ " Recebo o salario"+this.salario);
    }
    public funcionarioHeranca(String nome){
        super("Killian");
        //this.nome=nome; não pode ter um super e this um logo atras do outro e um ou outro;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.printf(String.valueOf(this.salario));
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public funcionarioHeranca(double salario) {
        super(" Himell FAH");
        this.salario = salario;
    }
}
