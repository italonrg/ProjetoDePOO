package nascimento_italo_maratonaJava.Intro;

public class aula07Arrays03 {
    public static void main(String[] args) {

        int [][] arreyInt = new int [3][];
        arreyInt[0]= new int[8];// no caso o arreyInt na posiçaõ 0 faz referencia a novo arrey de 8 posições;
        arreyInt [1] = new int[50];/// o mesemo se aplica aqui ;
        arreyInt [2]= new int[]{45,87,87,8787,121,544,8956,2154,};// agora note que não posso instanciar mais pois eu disse que arreyInt so se divide me 3 partes

        arreyInt[1]= new int[]{54, 78, 87, 65, 21, 32,87,78215,78,98,};

        for (int []arreioBase: arreyInt){
            for (int num : arreioBase){
                System.out.println(num+"");
            }
        }
        for (int [] arreioBase02:arreyInt){
            for (int num02 : arreioBase02){
                System.out.println(""+num02);
            }

        }

    }
}