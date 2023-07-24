package blocosDeInicializacao;

public class shorts {
    private String name;

    private static int [] episodes;
   static  {//bloco de inicializaçaõ

        /*
        **** NOTA SE QUISER QUE O BLOCO DE INICIALIZAÇÃO INICIE APENAS UMA VEZ USE O STATIC
        * no caso agora como mudei para static não importa quantos objetos eu crie aquele laço for
        * so vai ser inciado uma vez!!!
        //isso e um bloco de inicialização ele e executado toda vez que o objeto e criado
        ///tembém ele e executado antes do construtor
        * quando se cria um objeto e precisa que algo seja inicado junto com ele ai se usa
        * o bloco de inicialização*/

        episodes = new int[5];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i]= i+1;
            System.out.println("---------Funfou---------");
        }
        for ( int episodio : shorts.episodes){
            System.out.println(episodio+"-------");
        }
    }
    public shorts(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        shorts.episodes = episodes;
    }

    public shorts() {

    }
}
