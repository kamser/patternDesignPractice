package creditCardStrgy;

public interface CreditCardType {
    public String getCVV();
    public String getNumber();
    public String getExpireDate();
    public String getName();
    public double getCurrentDisposableAmount();
}
