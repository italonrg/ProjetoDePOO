package nascimento_italo_maratonaJava.Intro;

public class aula05exercicioswith {
    public static void main(String[] args) {
        byte dia = 4;

        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
