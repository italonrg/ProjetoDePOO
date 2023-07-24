package associacao;
/*
*
* 
*
*
*
*
*
*
*
*
*
*
* 1:15
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* */
public class jogador {
    private String nome;
    private String time;

    private jogador[] jogadores;
    /*Na classe jogador foi cirada um arreio de chamado jogadores
    * */

    public jogador(jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }
    public void imprime01(){
        System.out.println(this.nome);
        if (jogadores == null) {
            for (jogador jogador:jogadores) {
                System.out.println(jogador.getNome());
            }
        }
    }

    public void imprime(){
    System.out.println( this.nome);
    System.out.println(this.time);
}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public jogador(String nome) {
        this.nome = nome;
    }
}
