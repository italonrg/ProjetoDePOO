package Test;
import repositorio.repositorio;
import Util.repositorioArquivo;
import Util.resositorioBancoDeDados;
import Util.repositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class repositorioTest {
    public static void main(String[] args) {
          resositorioBancoDeDados ResositorioBancoDeDados = new resositorioBancoDeDados();
          ResositorioBancoDeDados.salvar();

          repositorio repPoli = new repositorioMemoria();
          repPoli.salvar();
        List<String> mainList =new ArrayList<>();
        mainList.add("max opel");
        mainList.add("max carrot");
        mainList.add("max faggot");
        mainList.add("max rabbit");
        mainList.add("max power");
        System.out.println(mainList);

    }
}
