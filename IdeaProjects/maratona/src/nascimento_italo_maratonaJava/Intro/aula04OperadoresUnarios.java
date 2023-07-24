package nascimento_italo_maratonaJava.Intro;

public class aula04OperadoresUnarios {

    public static void main(String[] args) {
        //operadores aritimeticos +,-,/,*
        /*
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1+numero2;/// o resulatado de uma divisão de inteiros sempre resulta em um inteiro;
        System.out.println(numero1+numero2);
*/
        /// operador de resto famoso%

        int resto = 7%2;
        System.out.println(resto);

        /// operadores atribuiçao +=,-=,*=,/=;
        /*
        boolean isDezMaiorQuevinte = 10>20;
        boolean isDezMenorQuevinte = 10<20;
        boolean isDezigualQuevinte = 10==20;
        boolean isDezdifernteQuevinte = 10!=20;

        System.out.println(isDezMaiorQuevinte);
        System.out.println(isDezMenorQuevinte);
        System.out.println(isDezigualQuevinte);
        System.out.println(isDezdifernteQuevinte);
*/
        /// operadores logicos (AND) && || (OU) , e NÃO (!)

/*
        int idade = 29;
        double salario = 3500D;
        boolean isDentroDaleiMaiorQue30 = idade >30 && salario > 4612;
        boolean isDentroDaLeiMenorQue30 = idade <30 && salario <4612;
        System.out.println(isDentroDaleiMaiorQue30);
        System.out.println(isDentroDaleiMaiorQue30);
*/
/*
        double contaCorrente = 200;
        double contaContaPoupanca = 1000;
        double valorXboxSeriesX = 5000D;
        boolean isXboxSeriesCompravel = contaCorrente > valorXboxSeriesX || contaContaPoupanca > valorXboxSeriesX;
        System.out.println(isXboxSeriesCompravel);
*/

        double bonus = 18000;
        bonus += 1000;//(bonus = bonus +1000;
        bonus -= 1000;
        bonus *=2;
        bonus /=2;
        bonus %=2;
        System.out.println(bonus);

        int contador = 0 ;
        contador +=1;
        System.out.println(contador);

        int contador02 = 0 ;
        System.out.println(++contador02);
    }




}
