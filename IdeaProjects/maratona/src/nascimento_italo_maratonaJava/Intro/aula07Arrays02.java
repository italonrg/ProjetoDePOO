package nascimento_italo_maratonaJava.Intro;

public class aula07Arrays02 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0]=45;
        idades[1]=98;
        idades[2]=74;
        System.out.println(idades[2]);
        System.out.println(idades[0]);
        System.out.println(idades[1]);

        String[] nomes = new String[5];
        nomes[0] = "Hugo";
        nomes[1] = "Amicia";
        nomes[2] = "Agata";
        nomes[3] = "Italo";
        nomes[4] = "Rafael";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
/*
* os Asrrays são como objetos e funcionam como metodos que podem ser referenciados
* de forma que esse lenght diz o tamanho dele */
        }
        nomes= new String[10];
        /*
        *Note que quando eu declarei o Array com 5 possições ele faz referncia aqueles valores que coloquei
        * quando o laço for se encerrou eu declarei novamente o Array nomes mas agora com 10 possições
        * no caso o Array não muda dinamicamente , e aqueles valorres os 5 foram perdeidos pois
        * nomes foi referenciado novamente */
    }


}
