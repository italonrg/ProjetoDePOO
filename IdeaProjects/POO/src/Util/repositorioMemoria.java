package Util;
import repositorio.repositorio;
public class repositorioMemoria implements repositorio{
    @Override
    public void salvar() {
        System.out.println(" Salvando em um arquivo ");
    }
}
