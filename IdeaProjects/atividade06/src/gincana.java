import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class gincana {
    class Gincana {
        public Object adicionarEquipe;
        private List<Equipe> equipes;

        public Gincana() {
            equipes = new ArrayList<>();
        }

        public void adicionarEquipe(Equipe equipe) {
            equipes.add(equipe);
        }

        public void removerEquipe(Equipe equipe) {
            equipes.remove(equipe);
        }

        public void adicionarPontosEquipe(String nomeEquipe, int quantidade) {
            Equipe equipe = encontrarEquipePorNome(nomeEquipe);
            if (equipe != null) {
                equipe.adicionarPontos(quantidade);
            } else {
                System.out.println("Equipe não encontrada.");
            }
        }

        public void removerPontosEquipe(String nomeEquipe, int quantidade) {
            Equipe equipe = encontrarEquipePorNome(nomeEquipe);
            if (equipe != null) {
                equipe.removerPontos(quantidade);
            } else {
                System.out.println("Equipe não encontrada.");
            }
        }

        public void mostrarPontuacaoEquipes() {
            for (Equipe equipe : equipes) {
                System.out.println("Equipe: " + equipe.getNome());
                System.out.println("Pontos: " + equipe.getPontos());
                System.out.println();
            }
        }

        public void finalizarGincana() {
            System.out.println("Pontuação total:");
            for (Equipe equipe : equipes) {
                System.out.println("Equipe: " + equipe.getNome());
                System.out.println("Pontos: " + equipe.getPontos());
                System.out.println();
            }

            Collections.sort(equipes, Comparator.comparing(Equipe::getPontos).reversed());

            System.out.println("Ranking:");
            for (int i = 0; i < equipes.size(); i++) {
                Equipe equipe = equipes.get(i);
                System.out.println((i + 1) + "º lugar: " + equipe.getNome() + " - " + equipe.getPontos() + " pontos");
            }
        }

        private Equipe encontrarEquipePorNome(String nomeEquipe) {
            for (Equipe equipe : equipes) {
                if (equipe.getNome().equals(nomeEquipe)) {
                    return equipe;
                }
            }
            return null;
        }
    }
}
