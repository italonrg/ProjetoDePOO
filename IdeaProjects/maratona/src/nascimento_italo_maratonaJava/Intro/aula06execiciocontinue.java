package nascimento_italo_maratonaJava.Intro;

public class aula06execiciocontinue {
    public static void main(String[] args) {
        double total = 30000;

        for (int parcela = (int) total; parcela >= 1; parcela--) {

            double valorParcela = total / parcela;
            if (valorParcela < 1000) {
                continue;

            }
            System.out.println("A parcela "+parcela+"R$$"+valorParcela);
        }
    }
}