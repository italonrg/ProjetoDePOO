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
    //todo:por padrão todos os atributos são constantes ou seja static final
    //todo;IMPORANTE **** O MODIFICADOR DE ACESSO NUNCA PODE SER MAIS RESTRITIVO QUE A SUPERCLASSE ;
    public static final  int MAX_SIZE =99;
     static void retriveMaxdataSIze(){
        System.out.println(" dentro do maxSize");
    }
}
//Todo: Uma interface e como uma classe abstrata que so tem metodos abstratos;ela serve para criar soluções de baixo acoplamento, e flexiveis;