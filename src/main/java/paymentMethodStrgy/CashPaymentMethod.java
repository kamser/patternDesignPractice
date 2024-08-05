package paymentMethodStrgy;

public class CashPaymentMethod implements PaymentMethod {

    private final String paymentMethodName;
    private final int paymentAmount;

    public CashPaymentMethod(String paymentMethodName, int paymentAmount) {
        this.paymentMethodName = paymentMethodName;
        this.paymentAmount = paymentAmount;
    }

    @Override
    public void pay() {
        System.out.println("This is the payment method: " + paymentMethodName + " and the amount is: " + paymentAmount);
    }

    public boolean validateCustomerData(){
        return true;
    }
    public void completeTransaction(){
        System.out.println("The transaction was completed by the process: " + paymentMethodName);
    }
}
