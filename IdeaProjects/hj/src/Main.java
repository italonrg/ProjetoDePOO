public class Main {
    public static void main(String[] args) {

        /// aqui era pra "chamar" os metodos que criei :( Cannot resolve this symbol'Conta'
        Conta conta01 = new Conta("001", 100, 50, "Ítalo");
        Conta conta02 = new Conta("002", 200, 10, "Rafael");

        conta01.saca(500, conta01);
        conta01.deposita(100, conta2);
        /// aqui era pra "utilizar" o metodo que faria o saque:( Cannot resolve this symbol'saca'

        System.out.println("Saldo da conta 1: " + conta01.getsaldo());
        System.out.println("Saldo da conta 2: " + conta02.getsaldo());
        class Conta {
            public String numero;
            public double saldo;
            public double limite;
            public String nome;
            public Conta() {
                this("", 0, 0, "");
            }
            public Conta(String numero, double saldo, double limite, String nome) {
                this.numero = numero;
                this.saldo = saldo;
                this.limite = limite;
                this.nome = nome;
                /*
                * O construtor Conta() é o construtor padrão da classe Conta,
                * que inicializa as propriedades com valores devidamente vazios!
                * */
            }
            public boolean saca(double valor) {
                if (valor <= limite && valor <= saldo) {
                    saldo -= valor;
                    return true;
                } else {
                    return false;
                    /*construtor "saca"
                    Se o saque for bem-sucedido, o valor é adicionado ao saldo
                     da conta de destino chamando o método
                     */
                }
            }
            public void deposita(double valor) {
                saldo += valor;
                //recebe um valor como parâmetro e adiciona esse valor ao saldo da conta.
            }
            public boolean transfere(double valor, Conta destino) {
                if (saca(valor)) {
                    destino.deposita(valor);
                    return true;
                } else {
                    return false;
                    /*4ecebe um valor e uma conta de destino como
                     parâmetros. Primeiro, ele verifica se é
                     possível realizar a transferência se sim realiza , se não não faz nada!
                    */
                }
            }
            public String getNumero() {
                return numero;
            }
            public void setNumero(String numero) {
                this.numero = numero;
            }
            public double getSaldo() {
                return saldo;
            }
            public void setSaldo(double saldo) {
                this.saldo = saldo;
            }
            public double getLimite() {
                return limite;
            }
            public void setLimite(double limite) {
                this.limite = limite;
            }
            public String getNome() {
                return nome;
            }
            public void setNome(String nome) {
                this.nome = nome;
            }
        }
    }
}