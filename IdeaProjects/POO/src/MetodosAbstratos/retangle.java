package MetodosAbstratos;

public class retangle extends Shape {

private double larguras;
private double altura;

    public retangle(double altura, double largura, MetodosAbstratos.color color) {
        super();
    }

    public retangle(double largura, double altura) {
        this.larguras = largura;
        this.altura = altura;
    }

    @Override
    public double area() {
        return larguras *altura;
    }

    public double getLarguras() {
        return larguras;
    }

    public void setLarguras(double larguras) {
        this.larguras = larguras;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
