package entities;

public class calculadorDeSalario {
    public static double valorPPago(double valorPorhora , double horasTrabalhadas){
        /* o 'static' pode ser chamado sem instanciar o objeto */
        return valorPorhora*horasTrabalhadas;
    }
}
