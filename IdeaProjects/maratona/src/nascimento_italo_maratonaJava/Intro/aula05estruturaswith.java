package nascimento_italo_maratonaJava.Intro;

public class aula05estruturaswith {
    public static void main(String[] args) {
        // imprima o dia da semana
        byte dia = 5;
        switch (dia) {
            ///tipos aceitos char ,byte , int , enum,String;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println(" Opção invalida");
        }

        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("HOMEM");
                break;
            case 'F':
                System.out.println("MULHER");
                break;

            default:
                System.out.println(" Opção invalida");
                break;
        }
    }
}