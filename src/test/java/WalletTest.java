import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {
    Wallet wallet;
    CreditCard creditCard;
    DebitCard debitCard;

    @Before
    public void before(){
        wallet = new Wallet();
        creditCard = new CreditCard(1234567,"10/24", 345, 500.00);
        debitCard = new DebitCard(12345678, "12/25", 222, 8765432,"11-22-33");
    }

    @Test
    public void canAddIChargeable(){
        wallet.addToCollection(creditCard);
        assertEquals(true, wallet.getCollection().contains(creditCard));
    }

    @Test
    public void canChooseIChargeable(){
        wallet.addToCollection(creditCard);
        wallet.addToCollection(debitCard);
        wallet.setSelectedIChargeable(debitCard);
        assertEquals(debitCard, wallet.getSelectedIChargeable());
    }

    @Test
    public void canPayWithSelectedIChargeable(){
        wallet.addToCollection(creditCard);
        wallet.addToCollection(debitCard);
        wallet.setSelectedIChargeable(creditCard);
        wallet.getSelectedIChargeable().charge(100.00);
        assertEquals(395.00, creditCard.getAvailableCredit(), 0.0);
    }
}
