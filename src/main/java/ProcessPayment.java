import paymentMethodStrgy.PaymentMethod;

public class ProcessPayment {
    public PaymentMethod paymentMethod;
    public ProcessPayment(){

    }

    public boolean processOrder(){
        if (paymentMethod.validateCustomerData()) {
            paymentMethod.pay();
            paymentMethod.completeTransaction();
        } else {
            System.out.println("There was something wrong with the transaction");
        }
        return true;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }


}
