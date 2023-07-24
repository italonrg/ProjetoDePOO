package associacao;

public class escola {
    private String nome;

    private professor[] professores;

  /*  public void imprime(){
        System.out.println(this.nome);
        if (professores == null) {
            return;
            for (professor Professor : professores){
                System.out.println(Professor.getNome());
            } O METODO IMPRIME NÃO FUNCIONA ,
        }
    }*/
    public escola(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(professor[] professores) {
        this.professores = professores;
    }
}
