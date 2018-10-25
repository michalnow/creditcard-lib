package pl.jkan.creditcard;

public class CreditCard{
    

    private boolean isBlocked;

    private double balance;
    private double cardLimit;

    
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


    public void withdraw(double amount){
        balance -= amount;
    }
    
    public double getBalance() {
        return balance;

    }
}