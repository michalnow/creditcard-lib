package pl.jkan.creditcard;

import org.junit.Assert;

import org.junit.Test;


public class CreditCardTest{

    @Test
    public void allowAssignLimitToCard(){

        CreditCard card = new CreditCard();

        card.assignLimit(2000.0);
        Assert.assertTrue(card.getLimit() == 2000.0);
    }

    @Test
    public void withdrawDecreaseAvaiableFounds(){
        CreditCard card = new CreditCard();
        
        card.assignLimit(2000);
        card.withdraw(500);
        
        Assert.assertTrue(card.getBalance() == 1500);
        
    }


}