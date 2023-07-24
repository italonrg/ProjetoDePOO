public class businnesAccount extends account{

    private Double noanAccount;

    public businnesAccount(Integer numeber, String holder, Double balance, Double noanAccount) {
        super(numeber, holder, balance);
        this.noanAccount = noanAccount;
    }

    public businnesAccount(Double noanAccount) {
        this.noanAccount = noanAccount;
    }

    public Double getNoanAccount() {
        return noanAccount;
    }

    public void setNoanAccount(Double noanAccount) {
        this.noanAccount = noanAccount;
    }
}
