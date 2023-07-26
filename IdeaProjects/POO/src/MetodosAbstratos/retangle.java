package MetodosAbstratos;

public class retangle extends Shape {

private double largura;
private double altura;

    public retangle(double altura, double largura, MetodosAbstratos.color color) {
        super();
    }

    public retangle(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura*altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
