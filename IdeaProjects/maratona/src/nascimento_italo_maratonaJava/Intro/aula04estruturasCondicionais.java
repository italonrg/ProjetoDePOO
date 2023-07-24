package nascimento_italo_maratonaJava.Intro;

public class aula04estruturasCondicionais {
    public static void main(String[] args) {

        double salarioAnual = 35000;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto;
        
        if (salarioAnual <= 34712){
           valorImposto = salarioAnual *primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <=68507) {
           valorImposto = salarioAnual*segundaFaixa;
        } else  {
           valorImposto = salarioAnual*terceiraFaixa;
        }
        System.out.println( salarioAnual);
        System.out.println(valorImposto);

    }
}
