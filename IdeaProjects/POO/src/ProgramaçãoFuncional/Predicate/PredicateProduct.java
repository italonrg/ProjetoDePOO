package ProgramaçãoFuncional.Predicate;

import ProgramaçãoFuncional.ProductLambida;

import java.util.function.Predicate;

public class PredicateProduct implements Predicate<ProductLambida> {

    @Override
    public boolean test(ProductLambida XVX) {
        return XVX.getPrice() >= 100.00;
    }
}
