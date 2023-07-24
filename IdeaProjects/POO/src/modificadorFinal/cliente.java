package modificadorFinal;
/*As regras do final definem que o comportamento dele não sera alterado
seja ele uma classe ou metodo ;
* */
public class cliente {
    private String nome;

    private String CPF;

    public cliente(String CPF) {
        this.CPF = CPF;
    }

    public String CPF() {
        return CPF;
    }

    public cliente setCPF(String CPF) {
        this.CPF = CPF;
        return this;
    }

    @Override
    public final String  toString() {
        return "cliente{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
    public String nome() {
        return nome;
    }

    public cliente setNome(String nome) {
        this.nome = nome;
        return this;
    }
}
