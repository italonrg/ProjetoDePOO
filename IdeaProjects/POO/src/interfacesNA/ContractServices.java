package interfacesNA;

import java.time.LocalDate;

public class ContractServices {
    private onilinePaymentSrevice OnlinePS;//todo: Associação entre a classe de contratos e a interface olinePayment;

    public ContractServices(onilinePaymentSrevice onlinePS) {
        OnlinePS = onlinePS;
    }


    public void processCotrat(contract Contract , int months){
        double basicQuota = Contract.getTotalValue() / months;
        for (int i = 1; i <=months ; i++) {
            //LocalDate dueDate = Contract.getData().plusMonths(i);

            double interest = OnlinePS.interestJ(basicQuota,i);
            double fee = OnlinePS.paymentFee(basicQuota+interest);
            double contaTotal = basicQuota+fee+interest;

            //Contract.getInstallment().add(new instalmenr(dueDate,contaTotal));//todo: No caso o add esta adicionando a lista o
        }
    }
}
