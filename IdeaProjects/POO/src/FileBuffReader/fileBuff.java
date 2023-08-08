package FileBuffReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileBuff {
    public static void main(String[] args) {
        String path = "C:\\Users\\italo\\OneDrive\\Imagens\\aa.txt";//todo: "path" caminho, quer dizer que a String e um caminho;
        FileReader fr = null;
        BufferedReader bf = null;//todo:comentario posterior: existe meio mais facil de declarar tudo isso:vide na outra classe "filebuff2";

        try{
            fr = new FileReader(path);//todo:filereader lê apartir do caminho que foi passado na String;
            bf = new BufferedReader(fr);//todo: Buffreader lê apartir do FileReader;pode ser colocado na mesma linha;

            String line = bf.readLine();//todo: no caso o readLine lê uma linha; caso chegue ao final ele retona nulo;
            //todo: Logica para ler o arquivo todo: usando o while , enquanto for diferente de nulo, fazer imprimir a proxima linha;

            while ( line != null){
                System.out.println(line);
                line = bf.readLine();//todo: esquema basico de leitura de arquivos com texto;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if ( bf != null){
                    bf.close();
                }
                if ( fr != null){
                    fr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
