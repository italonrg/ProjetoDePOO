public class Main {
    public static void main(String[] args) {


        Elevador elevador = new Elevador(8, 10);

        System.out.println("Andar atual: " + elevador.getAndarAtual()); // Saída: Andar atual: 0
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes()); // Saída: Pessoas presentes: 0

        elevador.entrar(); // Saída: Uma pessoa entrou no elevador.
        elevador.subir(); // Saída: O elevador subiu para o andar 1
        

        System.out.println("Andar atual: " + elevador.getAndarAtual()); // Saída: Andar atual: 1
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes()); // Sa
    }
    public static class Elevador {
        private int andarAtual;
        private int totalAndares;
        private int capacidade;
        private int pessoasPresentes;

        public Elevador(int capacidade, int totalAndares) {
            this.capacidade = capacidade;
            this.totalAndares = totalAndares;
            this.andarAtual = 0;
            this.pessoasPresentes = 0;
        }

        public void entrar() {
            if (pessoasPresentes < capacidade) {
                pessoasPresentes++;
                System.out.println("Uma pessoa entrou no elevador.");
            } else {
                System.out.println(" Elevador cheio!!! Não é possível entrar mais pessoas.");
            }
        }

        public void sair() {
            if (pessoasPresentes > 0) {
                pessoasPresentes--;
                System.out.println("Uma pessoa saiu do elevador.");
            } else {
                System.out.println(" Elevador vazio!!! Não há pessoas para sair.");
            }
        }

        public void subir() {
            if (andarAtual < totalAndares) {
                andarAtual++;
                System.out.println("O elevador subiu para o andar " + andarAtual);
            } else {
                System.out.println("O elevador já está no último andar. Não é possível subir mais.");
            }
        }

        public void descer() {
            if (andarAtual > 0) {
                andarAtual--;
                System.out.println("O elevador desceu para o andar " + andarAtual);
            } else {
                System.out.println("O elevador já está no térreo. Não é possível descer mais.");
            }
        }

        public int getAndarAtual() {
            return andarAtual;
        }

        public void setAndarAtual(int andarAtual) {
            this.andarAtual = andarAtual;
        }

        public int getTotalAndares() {
            return totalAndares;
        }

        public void setTotalAndares(int totalAndares) {
            this.totalAndares = totalAndares;
        }

        public int getCapacidade() {
            return capacidade;
        }

        public void setCapacidade(int capacidade) {
            this.capacidade = capacidade;
        }

        public int getPessoasPresentes() {
            return pessoasPresentes;
        }

        public void setPessoasPresentes(int pessoasPresentes) {
            this.pessoasPresentes = pessoasPresentes;
        }
    }
}