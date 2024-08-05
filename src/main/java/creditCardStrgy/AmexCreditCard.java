package creditCardStrgy;

public class AmexCreditCard implements CreditCardType{
    @Override
    public String getCVV() {
        return "345";
    }

    @Override
    public String getNumber() {
        return "123 123 43534 1234";
    }

    @Override
    public String getExpireDate() {
        return "12/34";
    }

    @Override
    public String getName() {
        return "AMEX";
    }

    @Override
    public double getCurrentDisposableAmount() {
        return 12.45;
    }
}
