package Test;

import associacao.jogador;

public class jogadorTest {
    public static void main(String[] args) {
        jogador jogador01 = new jogador(" CR7 ");
        jogador jogador02 = new jogador(" Mané ");
        jogador jogador03 = new jogador(" Mbappé ");

        //jogador[] jogadores = new jogador[3];
        jogador[] jogadores  = {jogador01,jogador02, jogador03};

        for (jogador jogador : jogadores){
            jogador.imprime();
        }

    }
}
