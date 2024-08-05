package paymentMethodStrgy;

import creditCardStrgy.CreditCardType;

public class CreditCardPaymentMethod implements PaymentMethod {

    private final double taxAmnt;
    private final String paymentMethodName = "CREDIT CARD";

    private final int transactionId;

    private CreditCardType creditCard;

    private final Double totalAmnt;

    public CreditCardPaymentMethod(double taxAmnt, int transactionId, Double totalAmnt, CreditCardType creditCard) {
        this.taxAmnt = taxAmnt;
        this.transactionId = transactionId;
        this.creditCard = creditCard;
        this.totalAmnt =  totalAmnt;
    }

    @Override
    public void pay() {
        if(taxAmnt > 0 && creditCard.getCVV() != null)
            System.out.println("This transaction was completed by the payment method: " + paymentMethodName);
        else
            System.out.println("There was an error with during the transaction with the ID: " + transactionId + ", please contact to support");
    }

    @Override
    public boolean validateCustomerData() {
        return creditCard.getCurrentDisposableAmount() - totalAmnt > 0;
    }

    @Override
    public void completeTransaction() {
        System.out.println("Transaction with the ID: " + transactionId + " and with the taxAmount: " + taxAmnt + " was complete by the payment method: " + paymentMethodName + ", using the credit card: " + creditCard.getName());
    }
}
