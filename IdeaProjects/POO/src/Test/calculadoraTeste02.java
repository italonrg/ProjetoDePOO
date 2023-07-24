package Test;

import Util.Calculadora;

public class calculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros= {12,23,45,49,78,54,12,36,18,3,};
        int[] teste= {12,23,45,49,78,54,12,36,18,3,};
        calculadora.somaArry(numeros);
      calculadora.somaVarArgs(78,3,1,4,9,78,12,45,36,45,7894,0,3,6,3,3);// a vantagem do varArgs e colocar os valores do arreio ja direto
    }
}
