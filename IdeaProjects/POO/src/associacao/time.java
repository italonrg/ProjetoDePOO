package associacao;

import java.sql.Time;

public class time {

    private String nome;

    private Time time;

    public String getNome() {
        return nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time= time;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public time(String nome) {
        this.nome = nome;
    }
}
