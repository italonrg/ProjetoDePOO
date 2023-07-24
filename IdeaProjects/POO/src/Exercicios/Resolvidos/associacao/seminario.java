package Exercicios.Resolvidos.associacao;

public class seminario {
    private String titulo;

    private aluno[] alunos;

    private local LOcal;

    public local getLOcal() {
        return LOcal;
    }

    public void setLOcal(local LOcal) {
        this.LOcal = LOcal;
    }

    public seminario(String titulo, aluno[] alunos, local LOcal) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.LOcal = LOcal;
    }

    public aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(aluno[] alunos) {
        this.alunos = alunos;
    }

    public seminario(String titulo, aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public seminario(String titulo) {
        this.titulo = titulo;
    }
}
