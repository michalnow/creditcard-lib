package pl.jkan.creditcard;

public class CreditCard{


    private boolean isBlocked;

    private double balance;
    private double cardLimit;
    private String cardNumber;

    public CreditCard(){
        this.cardNumber = "random_nmber";
    }

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public String getNumber(){
        return cardNumber;
    }

    public void assignLimit(double limit){
        balance = limit;
        cardLimit = limit;
    }

    public double getLimit(){
        return 2000;
    }


    public void block(){
        isBlocked = true;
    }

    public boolean isBlocked(){
        return isBlocked;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
    
     public void repayDebt(double debtRepay) {
        debtAmount -= debtRepay;
        balance -= debtRepay;
    }


}