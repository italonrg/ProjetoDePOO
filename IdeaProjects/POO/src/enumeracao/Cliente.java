package enumeracao;

public class Cliente {

    private String nome;
    private String CPF;

    private tipoPagamento TipoPagamento;//aqui eu estou criando um relacionamento entre cliente e enum tipoPafamento;

    public Cliente(String nome, String tipo, tipoPagamento tipoPagamento, tipoCliente tipoCliente) {
        this.nome = nome;
        this.CPF = tipo;
        TipoPagamento = tipoPagamento;
        TipoCliente = tipoCliente;
    }

    public enum tipoPagamento{
        DEBITO,CREDITO

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + CPF + '\'' +
                ", TipoPagamento=" + TipoPagamento +
                ", TipoCliente=" + TipoCliente +
                ", TipoClienteint=" + TipoCliente.valor() +
                '}';
    }

    /*
        public static final String pessoaFisica = "PESSOAFISICA";
        public static final String pessoaJuridica = "PESSOAJURIDICA";


        public String nome() {
            return nome;
        }

        public Cliente setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public String tipo() {
            return tipo;
        }

        public Cliente setTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "nome='" + nome + '\'' +
                    ", tipo='" + tipo + '\'' +
                    '}';
        }

        public Cliente(String nome, String tipo) {
            this.nome = nome;
            this.tipo = tipo;
            if (!tipo.equals(pessoaFisica) || tipo.equals(pessoaJuridica)) {

            }
        }

    */
 private tipoCliente TipoCliente;

    public String nome() {
        return nome;
    }

    public Cliente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String tipo() {
        return CPF;
    }

    public Cliente setCPF(String CPF) {
        this.CPF = CPF;
        return this;
    }

    public tipoCliente TipoCliente() {
        return TipoCliente;
    }

    public Cliente setTipoCliente(tipoCliente tipoCliente) {
        TipoCliente = tipoCliente;
        return this;
    }

    public Cliente(String nome, String tipo, tipoCliente tipoCliente) {
        this.nome = nome;
        this.CPF = tipo;
        TipoCliente = tipoCliente;
    }
}
