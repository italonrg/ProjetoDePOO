package Test;
import Model.estudante;
public class estudanteTeste {
    public static void main(String[] args) {
        estudante Estudante = new estudante();
        /*A classe estudante dela foi criada uma variavel , e feita uma nova instancia
        * dela no caso o new estudante e um objeto da classe estudante
        * lembrese que sempre que se for criar um novo onjeto o new=;
        * */
        /// dando valores aos atributos a variavel de referencia , não a classe estudante a variavel Estudante;
        /// E atravez da variavel de referencia que se acessa /passa os dados do objeto.
        Estudante.idade = 87;
        Estudante.nome = "Josvalda";
        Estudante.sexo = 'F';
        Estudante.salario = 500000D;

        System.out.println(Estudante.idade);
        System.out.println(Estudante.sexo);
        System.out.println(Estudante.nome);
}
    }