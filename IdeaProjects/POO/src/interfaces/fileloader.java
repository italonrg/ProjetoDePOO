package interfaces;

public class fileloader  implements DataLoader{
    @Override
    public void Load() {
        System.out.println(" Carregando dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
    }

    @Override
    public void remove() {

    }
}
