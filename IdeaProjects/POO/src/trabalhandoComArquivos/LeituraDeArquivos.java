package trabalhandoComArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LeituraDeArquivos {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\italo\\OneDrive\\Imagens\\aa.txt");//todo: para indicar que vc quer que a "\" ou qualquer caractere vc poem a barra invertida \;
        //System.out.println(file);
        //todo: para ler o arquivo e necesario, primeiro iniciar a classe Scanner nã obasta só criar a variavel e pedir pra imprimila;

        Scanner entrada = null;//new Scanner(System.in);//todo: aqui eu errei em passar um comando para receber uma entrada do teclado, por força do habito;
        try{
            entrada = new Scanner(file);
            //todo: a classe Scanner pode ser instanciada e criando uma variavel de referencia passando pra ela o caminho do arquivo para se aberto
            //todo : em todo caso, o arquivo e aberto e não lido como num "SOUT";
            //todo: Como pode haver uma exeção do tipo Exeption , ela deve ser tratada;

            while ( entrada.hasNextLine());
            System.out.println(entrada.nextLine());
        } catch (IOException e) {
            System.out.println(" Erro o arquivo não pôde ser encontrado !!! "+ e.getMessage());
        }
        finally {
            if (entrada!= null){//todo:checagem se o o valor e nulo;
                entrada.close();
            }
        }
    }
}
