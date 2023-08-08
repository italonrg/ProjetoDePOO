package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {

    public static void main(String[] args) {


        method001();

        System.out.println(" Fim do programa:");


    }
    public static void method001(){
        System.out.println("*******metodo001 START ***********");
        method002();
        System.out.println("*******metodo001 END ***********");
    }
    public static void method002(){
        System.out.println("*******metodo002 START ***********");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
            sc.close();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" Posição invalida no Arreio:");
            e.printStackTrace();// esse printStackTrace e um ratreador que ajuda a identificar de onde ta vindo a exeção;
            sc.next();
        }catch (InputMismatchException c){
            System.out.println(" Erro no imput!!!");
            System.out.println(" ********metodo002 END ***********");
        }finally {

        }
    }
}