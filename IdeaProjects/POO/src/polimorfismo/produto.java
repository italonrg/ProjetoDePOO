package polimorfismo;

public abstract class produto implements taxavel{

    protected String nome;
    protected double valor;


    public produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String nome() {
        return nome;
    }

    public double valor() {
        return valor;
    }

    @Override
    public double calcularImposto() {//Isso e um metodo abstrato ; classes abstratas tem metodos abstratos
        return 0;
    }

    public produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public produto setValor(double valor) {
        this.valor = valor;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
