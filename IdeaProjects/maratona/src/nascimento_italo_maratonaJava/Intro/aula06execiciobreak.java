package nascimento_italo_maratonaJava.Intro;

public class aula06execiciobreak {
    public static void main(String[] args) {
        double total=30000;

        for (int parcela = 1; parcela <=total ; parcela++) {

            double valorParcela = total/parcela;
            if (valorParcela<1000){
            break;
            }///lembre-se de espaçar as coisas quando for printar
            System.out.println(" O valor da parcela numero " + parcela + " R$ " + valorParcela);
        }
/// aprendendo o continue , o inverso do break
    }
}
