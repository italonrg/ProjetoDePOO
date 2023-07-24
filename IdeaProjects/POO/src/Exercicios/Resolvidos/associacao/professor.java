package Exercicios.Resolvidos.associacao;

public class professor {
    private String nome;
    private String especialidade;
    private seminario[] Seminarios;

    public professor(String nome, String especialidade, seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        Seminarios = seminarios;
    }
    public void imprime(){
        System.out.println("----------------");
        System.out.println(" Nome do aluno: "+ this.nome);
        if (this.Seminarios == null)return;
        System.out.println("### Seminarios cadastrados");

        for (seminario seminario : this.Seminarios) {

            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLOcal().getEndereco());
            System.out.println(" *** Alunos***");




        }


    }

    public seminario[] getSeminarios() {
        return Seminarios;
    }

    public void setSeminarios(seminario[] seminarios) {
        Seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public professor(String nome) {
        this.nome = nome;
    }

    public professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
}
