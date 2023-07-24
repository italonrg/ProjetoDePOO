package polimorfismo;

public class tomate extends produto {
    public static final double IMPOSTO_SOBRE_ALIMENTOS = 0.10;
    public static final String dataDeValidade="12/12/2022";
    @Override
    public double calcularImposto() {
        System.out.println("--------------");
        System.out.println(this.valor);
        return this.valor*IMPOSTO_SOBRE_ALIMENTOS;

    }
private String data;

    public String data() {
        return data;
    }

    public tomate setData(String data) {
        this.data = data;
        return this;
    }

    public tomate(String nome, double valor) {
        super(nome, valor);

    }

    @Override
    public String toString() {
        return "tomate{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }

}
