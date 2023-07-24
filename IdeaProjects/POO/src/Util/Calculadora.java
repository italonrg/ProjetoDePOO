package Util;

import java.util.Scanner;

public class Calculadora {
    public void somaDoisNumeros(){///isso aqui e o metodo criado!!! ele está sendo usado
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(20-10);
    }
    public void multiplicarDoisNumeros (int num01 , int num02){ ////
        /* Agora vamos passar parametros que são variaveis que serão usadas durante a excução.
        Imagine que o parametro e como se fosse um contrato que ele vai exigir que sejam passados os
        valores que foram descritos nos parenteses;
        */
        System.out.println(num01* num02);/// aqui o que o metodo faz e imprimir a a "*" do valor que for passado
    }
    public double divideDoisNumeros(double num01,double num02){

        if (num01==0){
            return 0;
        }if (num02==0){
            return 0;
        }
        return (int) (num01/num02);/// aqui eu fiz casting que para que o valor não saia quebrado!
    }
    public void imprimeUmTextoCasoSeja0(int num01,int num02){
        if (num01==0|| num02==0){
            System.out.println(" Aqui e thain thain tomi logo vc percebeu que o resultado e 0 ");
        }
        ///trabalhando com parametros de numeros primitivos
    }
    public void alteraDoisNumeros(int num1,int num2){
         num1 = 99;
         num2 = 100;
        System.out.println( " dentro do alteraDoisNumeros");
        System.out.println(" num1 " +num1);
        System.out.println(" num2 " + num2);
    }
public void somaArry (int [] numeros ){///aqui eu criei um metodo que tem como parametro um arreio;
        int soma = 0;
    for (int num : numeros) {
        soma+=num;
        System.out.println(soma);
        
    }
}
public void somaVarArgs(int ... Numeros){//Declaração de var agrs começa com o tipo e os tres pontinhos ele e usado para simplificar arreios
///quando colocar o varArgs não colocar mais de um atributo e se precisar coloque-o no final!!!
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um numero>>>>");
        int mult = entrada.nextInt();
        for ( int numTest : Numeros){
            mult*=numTest;
            System.out.println(mult);///Deu certo kkkkk nem acreito
        }
}
}
