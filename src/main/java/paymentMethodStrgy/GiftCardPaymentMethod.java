package paymentMethodStrgy;

public class GiftCardPaymentMethod implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Processing payment data from the gift card passed for it.");
    }

    @Override
    public boolean validateCustomerData() {
        return true;
    }

    @Override
    public void completeTransaction() {
        System.out.println("Your transacion was completed successfuly");
    }
}
