import creditCardStrgy.AmexCreditCard;
import creditCardStrgy.MasterCardCreditCard;
import paymentMethodStrgy.CreditCardPaymentMethod;
import paymentMethodStrgy.GiftCardPaymentMethod;

public class Store {

    public Store(){

    }
    public void PerformedPayment(){
        ProcessPayment processPayment = new ProcessPayment();
        processPayment.setPaymentMethod(new CreditCardPaymentMethod(1.23, 1992, 10.3, new AmexCreditCard()));
        processPayment.processOrder();
    }

    public static void main(String[] args) {
        Store s = new Store();
        s.PerformedPayment();
    }
}
