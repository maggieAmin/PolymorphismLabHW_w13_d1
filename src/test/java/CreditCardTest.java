import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(1234567,"10/24", 345, 500.00);
    }

    @Test
    public void canLogTransactions(){
        creditCard.charge(350.00);
        assertEquals(true, creditCard.getTransactionsLog().contains(350.00));
    }

    @Test
    public void chargeAddsPercentage(){
//        creditCard.charge(50.00);
        assertEquals(52.50, creditCard.addPercentage(50.00),0.0);
    }

    @Test
    public void canReduceCredit(){
        creditCard.charge(100.00);
        assertEquals(395.00, creditCard.getAvailableCredit(),0.0);
    }
}
