package enumeracao;

public enum tipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.05;
        }
    },
    DINHEIRO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.5;
        }

    },
    PIX{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.5;
        }
    };


    public abstract double calcularDesconto(double valor);

}