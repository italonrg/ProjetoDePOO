public class testeGitPower {
    private String name;
    private int days;
    private static String CPF;

    public testeGitPower(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public testeGitPower() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public static String getCPF() {
        return CPF;
    }

    public static void setCPF(String CPF) {
        testeGitPower.CPF = CPF;
    }
}
