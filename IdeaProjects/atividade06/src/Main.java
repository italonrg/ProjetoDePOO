import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {


        class Aluno {
            private String nome;
            private int idade;

            public Aluno(String nome, int idade) {
                this.nome = nome;
                this.idade = idade;
            }

            public String getNome() {
                return nome;
            }

            public int getIdade() {
                return idade;
            }
        }

        class Professor {
            private String nome;
            private String disciplina;

            public Professor(String nome, String disciplina) {
                this.nome = nome;
                this.disciplina = disciplina;
            }

            public String getNome() {
                return nome;
            }

            public String getDisciplina() {
                return disciplina;
            }
        }

        class Turma {
            private String nome;
            private List<Aluno> alunos;
            private Professor professor;

            public Turma(String nome, Professor professor) {
                this.nome = nome;
                this.professor = professor;
                alunos = new ArrayList<>();
            }

            public String getNome() {
                return nome;
            }

            public Professor getProfessor() {
                return professor;
            }

            public void adicionarAluno(Aluno aluno) {
                alunos.add(aluno);
            }

            public void removerAluno(Aluno aluno) {
                alunos.remove(aluno);
            }

            public List<Aluno> getAlunos() {
                return alunos;
            }
        }

    }
}