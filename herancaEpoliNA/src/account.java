public class account {

    private  Integer numeber;
    private String holder;
    private  Double balance;

    public account(Integer numeber, String holder, Double balance) {
        this.numeber = numeber;
        this.holder = holder;
        this.balance = balance;
    }

    public account() {
    }

    public Integer getNumeber() {
        return numeber;
    }

    public void setNumeber(Integer numeber) {
        this.numeber = numeber;
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

   public void withdraw (double amount){
        balance -= amount;
   }
   public void deposit(double amount){
        balance +=amount;

   }
}
