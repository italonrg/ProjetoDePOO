package nascimento_italo_maratonaJava.Intro;

public class aula06estruturasDerepetição {
    public static void main(String[] args) {
        /// for , do while e while.

        int count = 0;
        while (count <10){/// no caos o while ele sempre tem que retornar um booleano para funcionar. while e o velho enquanto
            System.out.println(count);/// pode ser implemntado no sout count++
            count+=1;
        }
        do {
            System.out.println("dentro do while");
        }while (count<10);///raramente usado

        for (int i=1;i<500;i++){
            System.out.println(i);
        }
    }
}
