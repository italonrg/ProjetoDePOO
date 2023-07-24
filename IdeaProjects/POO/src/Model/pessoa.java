package Model;

public class pessoa {
    private   int idade;
    private char sexo;

    private String nome;
    private double peso;
    private double altura;

public void Imprime(){
    System.out.println(this.nome);
    System.out.println(this.altura);
    System.out.println(this.sexo);
    System.out.println(this.peso);
    System.out.println(getSexo());//pode ser feito assim mas não e recomendado pois e esteticamnte feio!!!
}
//Pelo que eu entendi o set e para passar valores quando o metodo de acesso e privado
//como o metodo e privado , vc cria um metodo publico que vai receber os valores que vc  quiser passar

    /*Para alterarmos, modificarmos os valores de um atributo da classe de maneira protegida,
     utilizamos os métodos SET. Esse método não terá um retorno, pois o atributo será somente modificado,
     criando um método de tipo VOID, sem retorno. Porém ele deve receber algum argumento para que possa ocorrer a devida alteração.*/
public void teste (){
    System.out.println(" Thain thain tome , logo vc percebeu que o resulatado e 0 !!!");
}


public void setNome(String nome){//Agora se nos parametros tiver um nome igual ai vc terá de colocar o this;
    this.nome = nome;
}

    public void setSexo(char sx) {
      sexo = sx;// E importante usar o mesmo nome da variavel Ex: 'sexo' e "sexo" apesa de poder ser nomes diferentes
    }

    public void setIdade(int idade) {
    if (idade < 0 ){
        System.out.println(" Idade Invalida");
        return;
    }
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {

    return nome;
    }

    public double getPeso() {

    return peso;
    }

    public char getSexo() {

    return sexo;
    }

    public double getAltura() {

    return altura;
    }

    public int getIdade() {

    return idade;
    }

}
/* O metodo Get ele muito parecido com o Set o que muda e que ele tem um retorno e ele e usado para pegar um valor
* o Set ele passa o valor o Get pega/mostra o valor que foi passado*/

