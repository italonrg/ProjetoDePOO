package interfaces;

public class DataBaseLoader  implements DataLoader,dataRemover{

    @Override
    public void Load() {
        System.out.println(" carregando banco de dados");
    }

    @Override
    public void remove() {
        System.out.println(" removendo dados");
    }

}
