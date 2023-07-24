package nascimento_italo_maratonaJava.Intro;

public class aula05estruturasCondicionais {
    public static void main(String[] args) {

        int idade = 15 ;
     boolean isAutorizadoComprarBebidaAlcolica = idade >=18;

        if(isAutorizadoComprarBebidaAlcolica){
            System.out.println("pode comprar suas birita !!!");
        }
        if (isAutorizadoComprarBebidaAlcolica == false ){
            System.out.println( " não autorizado a comprar bebida alcilica");
        }

    }
}
