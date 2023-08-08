package FileBuffReader;

import java.io.File;
import java.util.Scanner;

public class ObtendoInformaçõesDoArquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caminho = sc.nextLine();

        File path = new File(caminho);

        System.out.println(" Nome do arquivo: "+path.getName());
        System.out.println(" Nome do arquivo: "+path.getParent());
        System.out.println(" Nome do arquivo: "+path.getPath());

    }
}
