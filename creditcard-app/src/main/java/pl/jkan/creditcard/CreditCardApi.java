package pl.jkan.creditcard;

public class CreditCardApi{

    private CreditCardPool pool;

    public CreditCardApi(CreditCardPool pool){
        this.pool = pool;
    }

    public void withdraw(String cardNumber, double money){
        pool.find(cardNumber).withdraw(money);
    }
}