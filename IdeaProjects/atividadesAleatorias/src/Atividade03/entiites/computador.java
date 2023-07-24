package Atividade03.entiites;

public class computador {
    private String fabricante;
    private String processador;
    private  String memoriaprincipal;
    private String memoriaSecundaria;

    public computador(String fabricante, String processador, String memoriaprincipal, String memoriaSecundaria) {
        this.fabricante = fabricante;
        this.processador = processador;
        this.memoriaprincipal = memoriaprincipal;
        this.memoriaSecundaria = memoriaSecundaria;
    }

    public String fabricante() {
        return fabricante;
    }

    public computador setFabricante(String fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    public String processador() {
        return processador;
    }

    public computador setProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public String memoriaprincipal() {
        return memoriaprincipal;
    }

    public computador setMemoriaprincipal(String memoriaprincipal) {
        this.memoriaprincipal = memoriaprincipal;
        return this;
    }

    public String memoriaSecundaria() {
        return memoriaSecundaria;
    }

    public computador setMemoriaSecundaria(String memoriaSecundaria) {
        this.memoriaSecundaria = memoriaSecundaria;
        return this;
    }
    public String trocarMemoria(){
        return " trocar Memoria";
    }
    public String trocarProcessador(){
        return " trocar Processador";
    }
    public String trocarMemoriaSecundaria(){
        return " trocar Memoria Secundaria";
    }
}
