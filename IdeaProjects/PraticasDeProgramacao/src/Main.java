import entites.pessoa;

public class Main {
    public static void main(String[] args) {

        pessoa pessoa00 = new pessoa(25,'M',"Max",1.85,82.451);
        pessoa pessoa01 = new pessoa(56,'F',"Anna",1.65,56.700);
        pessoa pessoa02 =new pessoa(28,'M',"Jorge",1.65,150.145);

        pessoa00.toString();
        System.out.println("----------------");
        System.out.println(pessoa00.IMC());
        pessoa01.toString();
        System.out.println("----------------");
        System.out.println(pessoa01.IMC());
        System.out.println("-----------------");
        System.out.println(pessoa02.IMC());
    }
}