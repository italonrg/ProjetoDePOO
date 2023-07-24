package modificadorFinal;

public class moto {
    private int ano;
    private String marca;
    private String modelo;

    public String modelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "moto{" +
                "ano=" + ano +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", Cliente=" + Cliente +
                '}';
    }

    private final cliente Cliente = new cliente("859688765-22");
    /*
     * Este codigo acima diz que a variavel de referencia Cliente que faz referencia ao objeto
     * new cliente nunca poderá ser alterada
     * */
    public static final double VELOCIDADE_LIMETE = 299.999;
    /*    // O modificador Final ele e uma consante e deve por boas praticas escrever da forma acima;
     * O modificador Final tambem pode ser inicializado com o bloco de inicialização assim:
     * { VELOCIDADE_LIMETE= 299.999
     * }
     *  Desse modo funciona pois o bloco de inicialização e primeira coisa que inicia e o valor
     * e inicializado;
     *
     *
     * */

    public moto setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public int ano() {
        return ano;
    }

    public moto setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public String marca() {
        return marca;
    }

    public moto setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public moto(String modelo, int ano, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }


}
