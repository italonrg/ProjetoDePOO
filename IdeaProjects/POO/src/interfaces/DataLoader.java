package interfaces;

public interface DataLoader {

    void Load();
    default void checkPermission(){
        System.out.println(" fazendo checagem de permissões");
    }
    default void remove(){
        System.out.println(" removendo dados");
    }
    //criando atributos
    //por padrão todos os atributos são constantes ou seja static final
    //IMPORANTE **** O MODIFICADOR DE ACESSO NUNCA PODE SER MAIS RESTRITIVO QUE A SUPERCLASSE ;
    public static final  int MAX_SIZE =99;
     static void retriveMaxdataSIze(){
        System.out.println(" dentro do maxSize");
    }
}
