import Atividade03.entiites.computadorDeMesa;
import Atividade03.entiites.smartPhone;



public class Main {

    public static void main(String[] args) {

        computadorDeMesa comutador00 = new computadorDeMesa(" Intel","I5","8GB","SSD120GB");
        smartPhone SM = new smartPhone(" Sansung","SnappDragon1245","6GB","64GB","14,5POL","1080X920","VIVO");

        comutador00.setFabricante(" Razer ");

        System.out.println(" Computador = "+comutador00.fabricante());
        System.out.println(" SmartPhone = "+SM.processador());
    }
}
