package ProgramaçãoFuncional;

public class ProductLambida {//todo:public class Product implements Comparable <Product:Não se esqueça de passar a classe para o Comaprable se não o "get" não funciona;
    private String name;
    private Double price;

    public ProductLambida(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    //todo:Este metodo abaixo e uma criação de um metodo estatico como parte do aprendizado de Predicados;
    public static boolean StaticPredicateProduct(ProductLambida XXIII){
        return XXIII.getPrice() >= 50.00;
    }
    //todo: Agora vamos fazer um medodo não estatico, de forma que ele não trabalha com o argumento e sim com o proprio objeto: "price" da classe, veja abaixo;
    public boolean NonStaticPredicateProduct(){
        return price ==100.00;
    }
    //todo:Agora um metodo estatico de consumer, para aumentar os valores em 20%;
    public static void StaticPriceUpdate( ProductLambida p){//todo: Use o void;
     p.setPrice(p.getPrice()* 2.2);
    }

    //todo:Metodo não estatico para alteração de valor;
    public void NonStaticPrice (){
        price = price*5.5;
    }
    //todo:Metodo estatico para deixar toda a lista em mausculo;

    public static String TudoMaisculo( ProductLambida TudoM){
        return TudoM.getName().toUpperCase();
    }
    public String TudoMaiusculoGGGG(){
       return name = name.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


   /* @Override
    public int compareTo(Product o) {
        return name.toUpperCase(Locale.ROOT).compareTo(o.getName());
    }
    */

    @Override
    public String toString() {
        return "ProductLambida{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
