package sobrecarga.Test;

import sobrecarga.Cartoon;

public class CartoonTest {
    public static void main(String[] args) {
        Cartoon cart = new Cartoon();

        cart.startup(" Courage","Terror",56,"call");
        cart.antherInfo(30, "PG13",6);

        cart.impress();
        System.out.println(cart.getDuration());

// what is an overload? and a method that has the same name but with parameters in a different order
    }
}
