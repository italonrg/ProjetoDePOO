package heranca;

public class bussinesAccountNA extends  AccountNA {
    private Double loanLimit;
    public bussinesAccountNA(){
        super();//a palavra super e para executar a logica do contrutor padrão da superclasse
    }

    public bussinesAccountNA(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    @Override
    public double withdraw(double amount) {
        super.withdraw(amount);//aqui eu chamei o metodo completo da superclasse e so adicionei o balance -=2.0/ele também funciona so chamando ;
        balance-=2.0;
        return amount;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void loan (double amount){
      if ( amount <= loanLimit){
          balance +=amount - 10;
      }

    }


}
