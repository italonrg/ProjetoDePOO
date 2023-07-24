package Atividade03.entiites;

public class computadorDeMesa extends computador {
    private String fabricanteDoGabinete;
    private String tipoGabinete;
    private String fonte;

    public computadorDeMesa(String fabricante, String processador, String memoriaprincipal, String memoriaSecundaria) {
        super(fabricante, processador, memoriaprincipal, memoriaSecundaria);
    }


    public String fabricanteDoGabinete() {
        return fabricanteDoGabinete;
    }

    public computadorDeMesa setFabricanteDoGabinete(String fabricanteDoGabinete) {
        this.fabricanteDoGabinete = fabricanteDoGabinete;
        return this;
    }

    public String tipoGabinete() {
        return tipoGabinete;
    }

    public computadorDeMesa setTipoGabinete(String tipoGabinete) {
        this.tipoGabinete = tipoGabinete;
        return this;
    }

    public String fonte() {
        return fonte;
    }

    public computadorDeMesa setFonte(String fonte) {
        this.fonte = fonte;
        return this;
    }

    public computadorDeMesa(String fabricante, String processador, String memoriaprincipal, String memoriaSecundaria, String fabricanteDoGabinete, String tipoGabinete, String fonte) {
        super(fabricante, processador, memoriaprincipal, memoriaSecundaria);
        this.fabricanteDoGabinete = fabricanteDoGabinete;
        this.tipoGabinete = tipoGabinete;
        this.fonte = fonte;
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
