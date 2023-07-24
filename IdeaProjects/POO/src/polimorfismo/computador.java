package polimorfismo;

public class computador  extends produto{
    public static  final double IMPOSTO=0.20;




    @Override
    public String toString() {
        return "computador{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public double calcularImposto() {

        System.out.println(" calculando o imposto!!!");
        System.out.println("------------");
        System.out.println(this.valor);
        return this.valor*IMPOSTO;
    }

    public computador(String nome, double valor) {
        super(nome, valor);
    }

}
