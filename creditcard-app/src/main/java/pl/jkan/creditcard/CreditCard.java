package pl.jkan.creditcard;

public class CreditCard{
    
    private boolean isBlocked;
    
    public void assignLimit(double limit){
        
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
}