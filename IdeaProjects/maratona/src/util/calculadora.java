package util;
public class calculadora {
    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println(a + " + " + b + " = " + resultado);
    }

    public static void soma(int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + resultado);
    }

    public static void subtracao(int a, int b) {
        int resultado = a - b;
        System.out.println(a + " - " + b + " = " + resultado);
    }

    public static void subtracao(int a, int b, int c) {
        int resultado = a - b - c;
        System.out.println(a + " - " + b + " - " + c + " = " + resultado);
    }

    public static void multiplicacao(int a, int b) {
        int resultado = a * b;
        System.out.println(a + " * " + b + " = " + resultado);
    }

    public static void multiplicacao(int a, int b, int c) {
        int resultado = a * b * c;
        System.out.println(a + " * " + b + " * " + c + " = " + resultado);
    }

    public static void divisao(int a, int b) {
        int resultado = a / b;
        System.out.println(a + " / " + b + " = " + resultado);
    }

    public static void divisao(int a, int b, int c) {
        int resultado = a / b / c;
        System.out.println(a + " / " + b + " / " + c + " = " + resultado);
    }

    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 5;
        soma(numero1, numero2);

        numero1 = 2;
        int numero3 = 3;
        soma(numero1, numero2, numero3);

        numero1 = 7;
        numero2 = 5;
        subtracao(numero1, numero2);

        numero1 = 7;
        int numero4 = 1;
        int numero5 = 5;
        subtracao(numero1, numero4, numero5);

        numero1 = 2;
        numero2 = 5;
        multiplicacao(numero1, numero2);

        numero1 = 2;
        numero3 = 3;
        multiplicacao(numero1, numero2, numero3);

        numero1 = 20;
        numero2 = 2;
        divisao(numero1, numero2);

        numero1 = 20;
        numero3 = 2;
        int numero6 = 5;
        divisao(numero1, numero3, numero6);
    }
}
