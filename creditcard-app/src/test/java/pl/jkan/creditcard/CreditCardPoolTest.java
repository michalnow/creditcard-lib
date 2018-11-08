package pl.jkan.creditcard;

import org.junit.Test;
import org.junit.Assert;

public class CreditCardPoolTest{

    private final static String cardNumber = "1234";

    @Test
    public void allowAddAndFindCard(){
        CreditCardPool  pool = new CreditCardPool();
        CreditCard c = new CreditCard(cardNumber);

        pool.add(c);

        CreditCard loaded = pool.find(cardNumber);

        Assert.assertTrue(loaded.getNumber().equals(cardNumber));
    }
}