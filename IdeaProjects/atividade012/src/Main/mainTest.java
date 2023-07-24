package Main;
import model.Pessoa;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import util.CSVUtil;

public class Main02 {

    public static void main(String[] args) throws IOException {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Andre";
        pessoa1.matricula = Long.parseLong("202310410520");
        pessoa1.cpf = Long.parseLong("08596325811");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";
        pessoa2.matricula = Long.parseLong("202310410520");
        pessoa2.cpf = Long.parseLong("08596325811");

        File arquivo = CSVUtil.criarArquivo("Alunos.csv");

        CSVUtil.escreverArquivo(arquivo, "Nome;Matricula;CPF");
        CSVUtil.escreverArquivo(arquivo, pessoa1.toString());
        CSVUtil.escreverArquivo(arquivo, pessoa2.toString());

        CSVUtil.fecharArquivo();

        CSVUtil.lerArquivo(arquivo);
    }

}


    }
}
