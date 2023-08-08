package MetodosAbstratos;public class circle extends Shape {
private double radio;

    public circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return radio*Math.PI;
    }
}
