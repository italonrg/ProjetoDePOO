package toString;

public class desenho {
    private String nome;

    @Override
    public String toString() {
        return "desenho{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String nome() {
        return nome;
    }

    public desenho setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public desenho(String nome) {
        this.nome = nome;
    }
}
