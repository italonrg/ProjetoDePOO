package Test;
import Util.Calculadora;
public class calculadoraTest {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();///aqui eu chamei o metodo que eu tinha criado la na outra classe;
        calc.subtraiDoisNumeros();
        calc.multiplicarDoisNumeros(30,20);/// aqui e so o metodo sendo chamado
        double result = calc.divideDoisNumeros(45,7);
        //aquie eu disse criei essa variavel result que recebe calc,dividirdoisnumeros

       double fuxx = calc.divideDoisNumeros(20,5);
        System.out.println(fuxx);

        calc.imprimeUmTextoCasoSeja0(78,0);
        calc.imprimeUmTextoCasoSeja0(78,45);
        System.out.println(result);
        //System.out.println(calc.multiplicarDoisNumeros(););repare que não se pode colocar print em metodos que não retornam nada
        int num1=1;
        int num2=2;
        calc.alteraDoisNumeros(12,45);
        System.out.println(num1);
        System.out.println(num2);
    }
}
