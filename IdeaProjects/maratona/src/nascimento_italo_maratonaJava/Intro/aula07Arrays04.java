package nascimento_italo_maratonaJava.Intro;

import java.util.Arrays;

public class aula07Arrays04 {
    public static void main(String[] args) {
        ///Arrys de Arrays , no caso o foreach
        ///ex : 1,2,3,4,5 meses
        /// 31,12,14,5,7, dias

/*
        String[][] nomes = new String[2][5];//// para fazer o Array multidimendional e so colocar cochetes extras;
        nomes[0][4] = "Acassia";
        nomes[0][3] = "Pedro";
        nomes[0][2] = "Rocha";
        nomes[0][1] = "JOsivalda";
        nomes[0][0] = "Alopecia";

        nomes[1][0] = "kull";
        nomes[1][1] = "jopa";
        nomes[1][2] = "lands";
        nomes[1][3] = "bald";
        nomes[1][4] = "wells";

        System.out.println(nomes[1]);// no caso o arreyo da frente ele e uma referencia dos areios que estão contidos nele
        System.out.println(nomes[0]);
        System.out.println();
        */

        int[][] dias = new int[2][2];
        dias[0][0] = 32;
        dias[0][1] = 52;


        dias[1][0] = 45;
        dias[1][1] = 75;

        for(int[]arrBase: dias){//esse role e so pra fazer a impressão dos valores dos arreios
            for (int num:arrBase){
                System.out.println(num);
            }
        }
        System.out.println("--------------------------------TEST");
        for (int [] num01:dias){
            System.out.println(num01.length);
        }
    }

}