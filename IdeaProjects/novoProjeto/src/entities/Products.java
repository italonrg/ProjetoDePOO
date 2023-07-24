package entities;
public class Products {
    public String name;
    public double price;
    public int quantity;

    public static void addProducts(int quantity) {
     quantity =+quantity;
    }


    public double totalValueInStock(){
        return price*quantity;
    }
    public void addProduct (int quantity){//para referenciar o atributo da classe deve-se usar o this
        this.quantity +=quantity;
    }


    public String toString(){
        return name
                 +"R$"+String.format("%.2f",price)+","+quantity+"total"+totalValueInStock();


    }
}
