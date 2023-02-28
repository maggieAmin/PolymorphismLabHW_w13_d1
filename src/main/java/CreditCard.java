public class CreditCard extends PaymentCard{
    private double availableCredit;

    public CreditCard(long cardNumber, String expiryDate, int securityNumber, double availableCredit) {
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }
    @Override
    public void charge(Double amount){
        Double totalAmount = addPercentage(amount);
        availableCredit -= totalAmount;
    }

    public double addPercentage(Double amount) {
        return amount += amount * 0.05;

    }
}
