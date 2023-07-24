package Test;
import interfaces.DataBaseLoader;
import interfaces.DataLoader;
import interfaces.fileloader;

public class DataloaderTest {
    public static void main(String[] args) {
        DataLoader database = new DataBaseLoader();
        fileloader filebase = new fileloader();

        database.Load();
        filebase.Load();
        System.out.println("------------");
        database.checkPermission();
        filebase.checkPermission();
        System.out.println("----------");
        database.remove();
        filebase.remove();
        System.out.println("----------");
        DataLoader.retriveMaxdataSIze();


        /*
        * pelo que eu entendi para “obrigar” a um determinado grupo de classes a ter métodos ou propriedades em comum
        * dentro de um determinado contexto, contudo os métodos podem
        * ser implementados em cada classe de uma maneira diferente. Pode-se dizer,
        *  que uma interface é um contrato que quando assumido por uma classe deve ser implementado.*/
    }
}
