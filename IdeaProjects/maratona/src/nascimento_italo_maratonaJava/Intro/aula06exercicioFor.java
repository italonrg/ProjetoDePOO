package nascimento_italo_maratonaJava.Intro;

public class aula06exercicioFor {
    public static void main(String[] args) {

        for (int i = 3; i < 100000; i++) {///esta e uma forma de resolver mas pode colocar if dentro do for
            if (i% 2 ==0) {
                System.out.println(i);
            }

        }
    }
}
