package Util;
import repositorio.repositorio;
public class resositorioBancoDeDados implements repositorio {
    @Override
    public void salvar() {
        System.out.println(" Salavando em banco de Dados");
    }
}
