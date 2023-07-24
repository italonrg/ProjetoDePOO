package Test;
import enumeracao.Cliente;
import enumeracao.tipoCliente;
import enumeracao.tipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(" Amicia","79876456654-78",tipoCliente.PESSOA_FISICA);
        Cliente cliente01 = new Cliente(" Hugo ","6549876456-87",tipoCliente.PESSOA_JURIDICA);
        Cliente cliente02 = new Cliente(" Arnald ","32165987-45",tipoCliente.PESSOA_SEI_LA);
        Cliente cliente03 = new Cliente(" jeux ","6549789879-12", Cliente.tipoPagamento.CREDITO,tipoCliente.PESSOA_JURIDICA);
        Cliente cliente04 = new Cliente(" Raquel","894653135-65", Cliente.tipoPagamento.DEBITO,tipoCliente.PESSOA_SEI_LA);

        System.out.println(cliente);
        System.out.println("--------------");
        System.out.println(cliente01);
        cliente01.setCPF("12345678-12");
        System.out.println("----------------");
        System.out.println(cliente01);
        System.out.println("------------------");
        System.out.println(cliente02.toString());
        System.out.println("--------------------");
        System.out.println(cliente03);
        System.out.println("---------------------");
        System.out.println(tipoPagamento.DEBITO.calcularDesconto(25.25));
        System.out.println("---------------------------------");
        System.out.println(tipoPagamento.CREDITO.calcularDesconto(125.47));
        System.out.println("-----------------------------");
        System.out.println(tipoPagamento.DINHEIRO.calcularDesconto(250.25));
        System.out.println("-----------------------------");
        System.out.println(tipoPagamento.PIX.calcularDesconto(500.25));
        System.out.println("-------------------------------------");
        tipoCliente tipoCliente01 = enumeracao.tipoCliente.tipoClientePorNome("pessoa fisica");
        System.out.println(tipoCliente01);



    }
}
