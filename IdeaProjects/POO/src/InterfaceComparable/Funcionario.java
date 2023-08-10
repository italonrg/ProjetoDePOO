package InterfaceComparable;

public class Funcionario {
    private String nome ;
    private Double salary;

    public Funcionario(String nome, Double salary) {
        this.nome = nome;
        this.salary = salary;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
