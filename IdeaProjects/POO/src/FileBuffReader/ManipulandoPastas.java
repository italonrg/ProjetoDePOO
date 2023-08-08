package FileBuffReader;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite o caminho para a pasta: ");
        String caminho = sc.nextLine();

        File path = new File(caminho);
        File[] pastas = path.listFiles(File::isDirectory);//todo: foi criado um arreio "pastas" que irá adicionar
        for (File file: pastas){
            System.out.println(file);
        }
        File[] arquivos = path.listFiles(File::isFile);
        for (File XXX : arquivos){
            System.out.println(XXX);
        }

        boolean sucesso = new File(caminho +"\\subdiretorio").mkdir();//todo: esse e o comando para criar sbdiretorios;
        System.out.println(sucesso+" A pasta foi criada com sucesso");

     /*
        System.out.println(" Digite o caminho da pasta para checar: ");

        String Cpasta = sc.nextLine();

        File path01 = new File(Cpasta);
        File[] ChechPast = path01.listFiles(File::canExecute);
        for ( File XXX : ChechPast){
            System.out.println(XXX);
        }
        //todo: deu uma exeção do tipo NullPointer
           " local5"  não sei o qeu e não tenho teempo de resolver;
      */
    }
}
