package ProgramaçãoFuncional;

public class ProductLambida {//todo:public class Product implements Comparable <Product:Não se esqueça de passar a classe para o Comaprable se não o "get" não funciona;
    private String name;
    private Double price;

    public ProductLambida(String name, Double price) {
        this.name = name;
        this.price = price;
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

}
