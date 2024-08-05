import creditCardStrgy.MasterCardCreditCard;
import paymentMethodStrgy.CreditCardPaymentMethod;
import paymentMethodStrgy.GiftCardPaymentMethod;

public class Store {

    public Store(){

    }
    public void PerformedPayment(){
        ProcessPayment processPayment = new ProcessPayment();
        processPayment.setPaymentMethod(new GiftCardPaymentMethod());
        processPayment.processOrder();
    }

    public static void main(String[] args) {
        Store s = new Store();
        s.PerformedPayment();
    }
}
