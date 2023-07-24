package util;

public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {

        this.valor = valor;
    }

    public abstract String imprimir();
}

class PagamentoEmDinheiro extends Pagamento {
    private double valorRecebido;
    private double troco;

    public PagamentoEmDinheiro(double valor, double valorRecebido) {
        super(valor);
        this.valorRecebido = valorRecebido;
        this.troco = valorRecebido - valor;
    }

    @Override
    public String imprimir() {
        return "Valor do pagamento: R$" + valor +
                "\nValor recebido: R$" + valorRecebido +
                "\nTroco: R$" + troco;
    }
}

class PagamentoEmCartao extends Pagamento {
    private String bandeira;
    private long numeroTransacao;

    public PagamentoEmCartao(double valor, String bandeira, long numeroTransacao) {
        super(valor);
        this.bandeira = bandeira;
        this.numeroTransacao = numeroTransacao;
    }

    @Override
    public String imprimir() {
        return "Valor do pagamento: R$" + valor +
                "\nBandeira do cartão: " + bandeira +
                "\nNúmero da transação: " + numeroTransacao;
    }
}
class NotaFiscal{
    public static void main(String[] args) {

        PagamentoEmDinheiro pagDin = new PagamentoEmDinheiro(12.12,10.00);
        PagamentoEmCartao PagCar = new PagamentoEmCartao(50.45,"Visa",123456789);

        pagDin.imprimir();
        PagCar.imprimir();
    }
}
























