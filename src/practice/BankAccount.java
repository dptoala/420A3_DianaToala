package practice;

public class BankAccount {
    //Attributes
    private int accountNumber;
    private double balance;

    //Constructor
    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance= balance;
    }

    //Getters and Setters
    public int GetAccountNumber(){ return this.accountNumber;}
    public double GetBalance(){ return this.balance;}

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Functions
    public boolean deposit(double amount){
        if (amount >0) {
            balance += amount;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean withdraw(double amount){
        if (amount >0 &&  amount <= balance){
            balance -= balance;
            return true;
        }
        else{
            return false;
        }
    }

    public double getBalance(){
        return balance;
    }


}
