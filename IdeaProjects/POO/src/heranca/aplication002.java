package heranca;

public class aplication002 {
    public static void main(String[] args) {
        AccountNA accc01 = new AccountNA(1001," Sandy",100.00);
        accc01.withdraw(20.00);
        System.out.println(accc01.getBalance());
        AccountNA accc02 = new savingAccountsNA(1002,"Bob",100.00,10.00);
        accc02.withdraw(50);
        System.out.println(accc02.getBalance());
        AccountNA accc03 = new bussinesAccountNA(1004," Nand",500.00,1000.00);
        accc03.withdraw(200);
        System.out.println("Vc:"+accc03.getHolder()+" Tem :"+accc03.getBalance()+" R$");
        //////////daqui para baixo e polimorfismo!!!
        AccountNA X = new AccountNA(1212," Carla",500.00);
        AccountNA Y = new bussinesAccountNA(1445,"Anna",500.00,1000.00);

        System.out.println("------------------------------------------------");
        System.out.println(X.withdraw(100));
        System.out.println(Y.withdraw(100));
    }


}
