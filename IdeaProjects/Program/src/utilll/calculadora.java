package utilll;
import java.util.Random;
public class calculadora {

    public class Calculator {//// pi
        public static final double PI = 3.14159;
        public double circumference(double radius) {
            return 2.0 * PI * radius;
        }
        public double volume(double radius) {
            return 4.0 * PI * radius * radius * radius / 3.0;
        }
    }

    Calculator calc = new Calculator();
    private Random sc;
    ///não sei o que aconteceu aqui pois a IDE criar um "field"
    /*é um método estático disponibilizado pela classe Math da linguagem Java.
     Esse método retorna números aleatórios do tipo double,
     mas apenas aqueles incluídos no intervalo de 0.0 até 1.0.*/
    double radius = sc.nextDouble();
    double c = calc.circumference(radius);
    double v = calc.volume(radius);

}
