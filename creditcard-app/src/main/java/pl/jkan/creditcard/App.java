package pl.jkan.creditcard;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        CreditCardPool pool = new CreditCardPool();
        CreditCard c1 = new CreditCard("1234");
        CreditCard c2 = new CreditCard("7657");

        pool.add(c1);
        pool.add(c2);
        CreditCardApi = new CreditCardApi(pool);

        Runnable wife = () -> {
            while(true){
                api.withdraw("1234",200);
            }
        }

        Runnable hausband = () -> {
            while(true){
                api.withdraw("1234",50);
            }
        }
    }
}
