package polimorfismo;

public class notebook extends produto{

    public static  final double IMPOSTO=0.20;
    @Override
    public String toString() {
        return "notebook{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public String nome() {
        return super.nome();
    }

    @Override
    public double valor() {
        return super.valor();
    }

    @Override
    public double calcularImposto() {
        System.out.println(" calculando o imposto!!!");
        System.out.println("------------");
        System.out.println(this.valor);
        return this.valor*IMPOSTO;
    }

    public notebook(String nome, double valor) {
        super(nome, valor);


    }
}
