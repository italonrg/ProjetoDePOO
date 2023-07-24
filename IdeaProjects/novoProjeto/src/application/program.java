package application;
import entities.Products;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products CHIPILA = new Products();
        System.out.println(" entre com o nome so produto:");

        System.out.print("nome");
        CHIPILA.name= sc.nextLine();

        System.out.println("preço");
        CHIPILA.price = sc.nextDouble();

        System.out.println("quantidade em estoque");
        CHIPILA.quantity= sc.nextInt();

        System.out.println("product data"+Products.class);

        System.out.println();
        int quantity = sc.nextInt();
        Products.addProducts(quantity);

        System.out.println();
        System.out.println();

    }
}
