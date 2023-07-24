class Equipe {
    private String nome;
    private int pontos;

    public Equipe(String nome) {
        this.nome = nome;
        this.pontos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void adicionarPontos(int quantidade) {
        pontos += quantidade;
    }

    public void removerPontos(int quantidade) {
        if (pontos - quantidade >= 0) {
            pontos -= quantidade;
        } else {
            System.out.println("A quantidade de pontos a ser removida é maior do que a quantidade de pontos da equipe.");
        }
    }
}
