package FileBuffReader;

import java.io.*;

public class filleBuffWhirter {
    public static void main(String[] args) {
        String[] lines = new String[]{" boa noite", " bom Dia", " boa terde"};

        //todo: ATUALIZAÇÃO : não foi possivel escrever ou criar as linnhas por restrições do windows, mas de qualquer forma deu certo pois a exeção funcionu;
        //todo: a função do progrma e gravar em um arquivo o que tiver nas posições do arreio;
        //todo: o comando fille/buffWirther e para escrever, ou substituir arquivos;

        String path = "C:\\Users\\italo\\OneDrive";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path ,true))){//todo: esse "true" e para que não seja criado um novo arquivo e só re-escrever;

            for (String line : lines){
                bw.write(line);
                bw.newLine();//todo: quebra de linha;
            }
        }catch (IOException DF){
            System.out.println(" Deu Ruim@@@@@"+DF.getMessage());
        }
        {
        }
    }
}