package creditCardStrgy;

public class VisaCreditCard implements CreditCardType {
    private final String CVV = "321";
    private final String number = "2222 3333 4444 5555";

    private final String expireDate = "09/26";
    private final String name = "VISA";
    private final double currentDisposableAmount = 100000000;
    @Override
    public String getCVV() {
        return CVV;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String getExpireDate() {
        return expireDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCurrentDisposableAmount() {
        return currentDisposableAmount;
    }
}
