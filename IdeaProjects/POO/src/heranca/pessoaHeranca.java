package heranca;

public class pessoaHeranca {

    protected String nome ;
    protected String CPF;
    protected enderecoHerenca endereco;

    @Override
    public String toString() {
        return "pessoaHeranca{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", endereco=" + endereco +
                '}';
    }

    /*
* Quando se adiciona um construtor em uma classe mãe obrigatoriamente deve
* implementado nas classe filhas , isso e que e o acoplamento;
* */
    static {
    System.out.printf(" Dentro do bloco estatico de ṕessoa");
}

    {
        System.out.printf(" bloco de inicalizaçaõ nãoestarico");
    }
    public pessoaHeranca (String nome){
        System.out.printf(" Dentro do construtor----------");
        this.nome= nome;
    }
    public pessoaHeranca(String nome,String CPF){

    }
    public void imprime(){
        System.out.printf(this.nome);
       // System.out.printf(this.endereco.getRua()+" "+this.endereco.getCep());
        /*
        * NÃO FUNCIONOU POIS " DISSE QUE endereco ESTA NULL OU SEJA VAZIO
        * LOGO NÃO PODE SE USASO EM SYSTEM-OUT , E NÃO CONSEGUI PASSAR UM VALOR PARA ELE
        * */
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public enderecoHerenca getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
    }


}
