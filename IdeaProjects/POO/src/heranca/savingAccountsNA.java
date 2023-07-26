package heranca;

public final class savingAccountsNA extends AccountNA {// A palavra final , diz que a classe final não pode ser herdada , nem ser criada subclasses;
    private Double interestRate = 0.5;

    public savingAccountsNA(){
        super();
    }
    public savingAccountsNA(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "savingAccountsNA{" +
                "interestRate=" + interestRate +
                ", balance=" + balance +
                '}';
    }
    public void updateBalance(){
        balance += balance* interestRate;
    }

    @Override
    public final double withdraw(double amount) {
        balance -= amount;
        return amount;
    }
}
