package nascimento_italo_maratonaJava.Intro;

public class aula07Arrays {
    public static void main(String[] args) {
        ///quero guardar tres idades
        int idade01 = 15;
        int idade02 = 15;
        int idade03 = 15;
        ///sintaxe de declaração de Arrays
        /// primeiro declara o tipo coloca os cochetes e da um nome logo apos new e a tipo e colocar o valor de memoria que se quer;
        int [] idades = new int[3];/// Arrays são obgetos na memoria;
        idades[0]=45;
        idades[1]=98;
        idades[2]=74;
        System.out.println(idades[2]);
    }
}
