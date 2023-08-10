package interfacesNA;

public class PayPalService implements onilinePaymentSrevice {


    @Override
    public double paymentFee(double ammount) {
        return ammount*0.2;
    }

    @Override
    public double interestJ(double ammount, int months) {
        return ammount * 0.01 * months;
    }
}
