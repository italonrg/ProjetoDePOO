package util;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CSVUtil {



    public class CSVutil {
        private static FileWriter fw;
        private static BufferedWriter bw;

        public static File criarArquivo(String nomeArquivo) throws IOException {
            File arquivo = new File("D:\\apps\\eclipse\\workspace\\" + nomeArquivo);

            if (!arquivo.exists()) {
                //cria um arquivo (vazio)
                arquivo.createNewFile();
            }

            return arquivo;
        }

        public static void escreverArquivo(File arquivo, String texto) throws IOException {
            //escreve no arquivo
            if (fw == null) {
                fw = new FileWriter(arquivo, true);
            }

            if (bw == null) {
                bw = new BufferedWriter(fw);
            }
            bw.write(texto);
            bw.newLine();

        }

        public static void fecharArquivo() throws IOException {
            if (bw != null) {
                bw.close();
            }

            if (fw != null) {
                fw.close();
            }
        }

        public static void lerArquivo(File arquivo) throws IOException {
            //faz a leitura do arquivo
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            //enquanto houver mais linhas
            while (br.ready()) {
                //lê a proxima linha
                String linha = br.readLine();
                //faz algo com a linha
                System.out.println(linha);
            }

            br.close();
            fr.close();
        }
    }
}
