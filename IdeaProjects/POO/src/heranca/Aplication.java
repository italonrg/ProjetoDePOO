package heranca;

public class Aplication {
    public static void main(String[] args) {
        bussinesAccountNA cont001 = new bussinesAccountNA(1245,"Joss",1.245,5.000);
        cont001.draw(230);
        AccountNA acc = new AccountNA(1001,"Alex",0.0);
        bussinesAccountNA bcc = new bussinesAccountNA(1002,"Jhon",1.0000,100.0000);
        savingAccountsNA scc = new savingAccountsNA(1003," Anna",0.0,5.00000);

        // UPCASTING
        AccountNA acc01 = bcc;//note que não da erro , pois esta sendo feito o upcasting da super para e herdada;
        AccountNA acc02 = new AccountNA(1004," homer",54.555);//pode instanciar outro objeto atribuindo na superclasse;
        AccountNA acc03 = new savingAccountsNA(1005," Heliot",6.54,54.00)
                /*
                * No caso o upcasting vc pode atribuir objetos da subclasse como o businessAccount e saving , para a
                * superClasse a Account , note que pode instanciar o objeto direto ou criar a variavel e depois atribuir
                *
                *

                * */;

                //DOWNCAST
       // bussinesAccountNA bcc04 = (bussinesAccountNA) acc;///aqui teve que fazer um casting que foi forçar a converção;
      //  bcc04.getLoanLimit();//olha e ainda pode chamar os metodos da superclasse sem problemas;ate poque o metodo Loan não existe na classe AccountNA;
        //então fazendo o casting , da subclasse e possivel chamar metodos da subclasse para a superclasse; o inverso acontece mais facilmente;
       // bcc04.setLoanLimit(100.0000);//fazendo teste de chamade de metodos e de funções;

        //>>>>>>>>>>>>>>>>>>bussinesAccountNA acc05 =(bussinesAccountNA)acc03;<<<<<<<<<<<<<<<<<<<<<

        /*Exception in thread "main" java.lang.ClassCastException: class heranca.AccountNA cannot be cast
        to class heranca.bussinesAccountNA (heranca.AccountNA and heranca.bussinesAccountNA are in module POO of loader 'app')
	at POO/heranca.Aplication.main(Aplication.java:24)
	deu esse erro porque o objeto businnesAcount não pode ser convertido para SavingAccount , geralmente da erro , agora
	não sei se da pra fazer DOWNCAST de subclasses;
	*/
        if ( acc03 instanceof bussinesAccountNA) {
            bussinesAccountNA acc05 = (bussinesAccountNA)acc03;
            System.out.println(" emprestimo feito!!!");

        }
        if ( acc03 instanceof savingAccountsNA){
            savingAccountsNA acc056 = (savingAccountsNA) acc03;
        }

    }
}
