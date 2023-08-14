package Set.AtividadeSet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramSet {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Entre como o caminho do arquivo: ");
        String caminho = entrada.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            Set<LogEtire> set = new HashSet<>();//todo:instanciando  o hasSet;pq ele? pq para o problema ele e o melhor pq ele não aceita repetições;
            //todo: função para ler uma aquivo :1°chame o br ,2° chame a operação readLine.3° passe uma variavel do tipo que se quer,4° faça um while para ler linha a linha;

            String linha = br.readLine();

            while (linha != null){
                //todo: recortando uma srting:
                String[] campos = linha.split(" ");//todo:aqui eu criei um vetor"arreio" que recebe a variavel linha, e o "split" diz que: corta quando tiver o que esta em " ";
                String nomeUsuario = campos[0];//todo: aqui crio uma variavel que está prgramada para receber sempre a primeira linha do que tiver;
                Date momento = Date.from(Instant.parse(campos[1]));

                set.add(new LogEtire(nomeUsuario,momento));//todo: aqui temos a instanciação do Logentire , já passando como argumento as variaveis que criei:nomeUsuario/momento;

                linha = br.readLine();
            }

            System.out.println(" Total de usuarios :"+ set.size());
        } catch (IOException e) {
            System.out.println(" Caminho de arquivo invalido:::"+e.getMessage());
        }
    }
}

