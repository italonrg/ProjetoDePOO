package modoficadorEstatico;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carrot = new Carro(" chalana ",300);
        Carro carrot02 = new Carro(" jamais ",220);
        Carro carrot03 = new Carro(" Twin Mil ",320);
        Carro carrot04 = new Carro(" Deora II",420);

        //carrot04.setVelociadeLimite(200);

        Carro.setVelociadeLimite(145);

        carrot.imprime();
        carrot02.imprime();
        carrot03.imprime();
        carrot04.imprime();
/*
* A regra das boas praticas dizem que o modificador estatico deve ser usado quando ele não acessa
* atributos da classe , pq ele faz referncia ao objeto e não a classe então logo há a possibilifade de
* ele refernciar um objeto que não foi criado */
    }
}
