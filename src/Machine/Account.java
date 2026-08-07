package Machine;

public class Account {
    private String name;
    private int accountNumber;
    private double balance;

    public Account(String name, int accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
        
    public int getNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    
}

