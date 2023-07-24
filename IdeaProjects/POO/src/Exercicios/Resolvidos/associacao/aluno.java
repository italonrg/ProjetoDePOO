package Exercicios.Resolvidos.associacao;

public class aluno {
    private String nome;
    private int idade;
private seminario seminario ;

    public Exercicios.Resolvidos.associacao.seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Exercicios.Resolvidos.associacao.seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
