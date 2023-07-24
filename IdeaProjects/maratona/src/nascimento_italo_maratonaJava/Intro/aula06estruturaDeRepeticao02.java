package nascimento_italo_maratonaJava.Intro;

public class aula06estruturaDeRepeticao02 {
    public static void main(String[] args) {

        int valorMax = 100;
        for (int i = 0; i <=valorMax; i++) {
            if (i>25){
                System.out.println(i+"=i");
                break;////o break para a execução do laço.

            }
            System.out.println(i);
        }
    }
}
