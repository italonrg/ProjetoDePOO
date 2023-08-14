package Set;

import java.util.Locale;
import java.util.Objects;
//todo: para que se possa fazer comparações nas classes deve se  implementar a clsse comparable
public class product implements Comparable<product> {//todo: aqui implenta a interface Comparable, já passa o nome da classe;

    private String name;
    private double price;//todo: esquei de colocar que era double ou int;

    @Override
    public String toString() {
        return "product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof product product)) return false;
        return Double.compare(product.getPrice(), getPrice()) == 0 && Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(product o) {
        return name.toLowerCase(Locale.ROOT).compareTo(o.getName().toUpperCase());//todo: aqui name : com tudo maiusculo e .compare e comparar, com o getName, poderia ser o getPrice tbm;
    }
}
