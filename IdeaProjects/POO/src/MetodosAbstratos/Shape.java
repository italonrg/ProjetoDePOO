package MetodosAbstratos;

public abstract class Shape {

    private color color;// o enum ele vira tipo um "tipo" como String ou int , ai vc coloca o nome do atributo;

    public MetodosAbstratos.color getColor() {
        return color;
    }

    public void setColor(MetodosAbstratos.color color) {
        this.color = color;
    }
    public abstract double area();//metoso abstrato não tem corpo ; esse era um erro que eu estava cometendo;
}
