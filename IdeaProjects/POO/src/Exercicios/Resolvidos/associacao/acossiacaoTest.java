package Exercicios.Resolvidos.associacao;

public class acossiacaoTest {
    public static void main(String[] args) {

        local local = new local(" Rua das Mangabeiras");

        aluno Alano = new aluno("Flexpower",14);

        professor proferr = new professor(" Master Of Muppets","faggssice");

        seminario seminario = new seminario(" nobody loves you");

        aluno[] alunosParaSeminario = {};

        seminario Seminariosss = new seminario(" In The End",alunosParaSeminario,local);

        seminario[] seminarioDisponiveis={seminario};

        proferr.setSeminarios(seminarioDisponiveis);
        proferr.imprime();
        Alano.getNome();
    }
}
