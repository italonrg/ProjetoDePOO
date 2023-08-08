package FileBuffReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileBuff2 {
    public static void main(String[] args) {
        String path = "C:\\Users\\italo\\OneDrive\\Imagens\\aa.txt";//todo: "path" caminho, quer dizer que a String e um caminho;


        try ( BufferedReader bf = new BufferedReader(new FileReader(path))){
         //todo:contextualizando tudo:foi colocado um BufferReader, e instanciado dentro da parte de argumentos o file reader, poupando de colocar aquele monte de variavel;
            String line = bf.readLine();


            while ( line != null){
                System.out.println(line);
                line = bf.readLine();//todo: esquema basico de leitura de arquivos com texto;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }
    }

