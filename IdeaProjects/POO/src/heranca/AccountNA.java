package heranca;

public class AccountNA {
    private Integer number;
    private String holder;
    protected Double balance;

    public AccountNA() {
    }

    public AccountNA(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
public double withdraw (double amount){
        balance -=amount + 5;
    return balance;
}

    public void draw ( double amount){
        balance +=amount;
    }

    @Override
    public String toString() {
        return "AccountNA{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
