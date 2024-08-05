package creditCardStrgy;

public class MasterCardCreditCard implements CreditCardType {
    private final String CVV = "123";
    private final String number = "1234 4566 2123 1234";

    private final String expireDate = "12/25";
    private final String name = "MASTER CARD";
    private final double currentDisposableAmount = 1103.34;
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
