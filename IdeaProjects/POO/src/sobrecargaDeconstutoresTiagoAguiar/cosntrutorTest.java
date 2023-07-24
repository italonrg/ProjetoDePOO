package sobrecargaDeconstutoresTiagoAguiar;

public class cosntrutorTest {
    public static void main(String[] args) {

        sobrecagaCOnstrutor fg = new sobrecagaCOnstrutor("Mary","Anna");
        sobrecagaCOnstrutor fg01 = new sobrecagaCOnstrutor("Janne","Flex");

        System.out.println(fg.getFirstName());
        System.out.println(fg.getLastName());
        System.out.println(fg.output());
        System.out.println(fg.output(false));
        System.out.println(fg.toString());
        fg.setFirstName("Amicia");
        fg.setLastName("De Rune");

        System.out.println(fg.getFirstName()+" "+fg.getLastName());
        System.out.println(fg01.toString());

        /*
        * no caso a sobrecarga de metodos e usada quando construtores ou metodos tem funçoes parecidas
        * mas execuçẽos diferentes*/

    }

}
