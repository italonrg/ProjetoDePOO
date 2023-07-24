package modoficadorEstatico;



public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velociadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velociadeLimite = velociadeLimite;
    }

    public void imprime(){
        System.out.println("----------");
        System.out.println(" nome "+this.nome);
        System.out.println(" velocidade limite "+this.velociadeLimite);
        System.out.println(" velocidade maxima "+this.velocidadeMaxima);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelociadeLimite() {
        return velociadeLimite;
    }

    public static void setVelociadeLimite(double velociadeLimite) {
        Carro.velociadeLimite = velociadeLimite;
    }



}
