package ProgramaçãoFuncional.Consumer;

import ProgramaçãoFuncional.ProductLambida;

import java.util.function.Consumer;

public class PriceUpdadeConsumer implements Consumer<ProductLambida> {
    @Override
    public void accept(ProductLambida p12) {
        p12.setPrice(p12.getPrice() * 1.1);//todo:sempre que quiser alterar um valor use o "set" quando for so pra mostrar use o "get";

    }
}
