import java.util.ArrayList;

public abstract class PaymentCard implements IChargeable {
    private long cardNumber;
    private String expiryDate;
    private int securityNumber;
    private ArrayList<Double> transactionsLog;

    public PaymentCard(long cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.transactionsLog = new ArrayList<>();
    }

    public void charge(Double purchaseAmount){
        transactionsLog.add(purchaseAmount);

    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public ArrayList<Double> getTransactionsLog() {
        return transactionsLog;
    }
}
