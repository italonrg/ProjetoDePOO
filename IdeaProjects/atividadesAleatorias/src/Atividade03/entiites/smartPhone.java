package Atividade03.entiites;

public class smartPhone extends  computador{


    private String tamanhoDeTela;
    private String densidadeDePixels;
    private String operadora;

    public smartPhone(String fabricante, String processador, String memoriaprincipal, String memoriaSecundaria, String tamanhoDeTela, String densidadeDePixels, String operadora) {
        super(fabricante, processador, memoriaprincipal, memoriaSecundaria);
        this.tamanhoDeTela = tamanhoDeTela;
        this.densidadeDePixels = densidadeDePixels;
        this.operadora = operadora;
    }

    public String tamanhoDeTela() {
        return tamanhoDeTela;
    }

    public smartPhone setTamanhoDeTela(String tamanhoDeTela) {
        this.tamanhoDeTela = tamanhoDeTela;
        return this;
    }

    public String densidadeDePixels() {
        return densidadeDePixels;
    }

    public smartPhone setDensidadeDePixels(String densidadeDePixels) {
        this.densidadeDePixels = densidadeDePixels;
        return this;
    }

    public String operadora() {
        return operadora;
    }

    public smartPhone setOperadora(String operadora) {
        this.operadora = operadora;
        return this;
    }

    public smartPhone(String fabricante, String processador, String memoriaprincipal, String memoriaSecundaria) {
        super(fabricante, processador, memoriaprincipal, memoriaSecundaria);
    }


    @Override
    public String fabricante() {
        return super.fabricante();
    }

    @Override
    public computador setFabricante(String fabricante) {
        return super.setFabricante(fabricante);
    }

    @Override
    public String processador() {
        return super.processador();
    }

    @Override
    public computador setProcessador(String processador) {
        return super.setProcessador(processador);
    }

    @Override
    public String memoriaprincipal() {
        return super.memoriaprincipal();
    }

    @Override
    public computador setMemoriaprincipal(String memoriaprincipal) {
        return super.setMemoriaprincipal(memoriaprincipal);
    }

    @Override
    public String memoriaSecundaria() {
        return super.memoriaSecundaria();
    }

    @Override
    public computador setMemoriaSecundaria(String memoriaSecundaria) {
        return super.setMemoriaSecundaria(memoriaSecundaria);
    }

    @Override
    public String trocarMemoria() {
        return super.trocarMemoria();
    }

    @Override
    public String trocarProcessador() {
        return super.trocarProcessador();
    }

    @Override
    public String trocarMemoriaSecundaria() {
        return super.trocarMemoriaSecundaria();
    }
}
