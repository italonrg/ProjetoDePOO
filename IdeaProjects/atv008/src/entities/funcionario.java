package entities;

public class funcionario {
    public String nome;///atributos
    public double valorPorHora;
    public double horasTrabalhadas;

    public funcionario(String nome,double valorPorHora,double horasTrabalhadas){///construtor
        this.nome = nome;
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double valorPago(){//aqui no caso esse metodo não e estatico pois o valor dele muda de acordo com o objeto
        return valorPorHora*horasTrabalhadas;
    }
}
