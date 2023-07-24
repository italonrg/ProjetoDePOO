package Test;

import associacao.jogador;
import associacao.time;

import java.sql.Time;

public class timeTeste {
    public static void main(String[] args) {
        jogador jogador01 = new jogador("Jox");
        time Time = new time("Bahia");

        System.out.println(Time.getNome());
//jogador01.imprime();
    }
}
