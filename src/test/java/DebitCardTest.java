import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;
    @Before
    public void before(){
        debitCard = new DebitCard(12345678, "12/25", 222, 8765432,"11-22-33");
    }

    @Test
    public void canCharge(){
        debitCard.charge(100.00);
        assertEquals(true, debitCard.getTransactionsLog().contains(100.00));
    }
}
