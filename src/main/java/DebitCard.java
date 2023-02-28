public class DebitCard extends PaymentCard{
    private long accountNumber;
    private String sortCode;


    public DebitCard(long cardNumber, String expiryDate, int securityNumber, long accountNumber, String sortCode) {
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }


}
