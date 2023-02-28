import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard(20.00);
    }

    @Test
    public void canCharge(){
        giftCard.charge(5.00);
        assertEquals(15.00, giftCard.getBalance(),0.0);
    }
}
