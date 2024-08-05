package creditCardStrgy;

public class BACCreditCard implements CreditCardType {
    private final String CVV = "555";
    private final String number = "1233 43435 23423 5342 2";

    private final String expireDate = "01/29";
    private final String name = "BAC";
    private final double currentDisposableAmount = 3.65;
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
