package entities;
public class triangle {//triangulo aqui seria uma entidade///observa que triangle ele agora e um tipo assim como double
    public double a;///estes são atributos da classe
    public double b;///estes são atributos da classe
    public double c;///estes são atributos da classe

    ///criando uma função

    public double area(){
        double p = (a+b+c)/2;
        return  Math.sqrt(p * (p - a) * (p -b) * (p - c));
    }
}
