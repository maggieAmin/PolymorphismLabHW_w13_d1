public class GiftCard implements IChargeable{
    private double balance;

    public GiftCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void charge(Double purchaseAmount){
        balance -= purchaseAmount;
    }
}
