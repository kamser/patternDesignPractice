package paymentMethodStrgy;

public interface PaymentMethod {
    public void pay();
    public boolean validateCustomerData();
    public void completeTransaction();
}
