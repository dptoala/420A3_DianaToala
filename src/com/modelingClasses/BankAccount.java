package com.modelingClasses;

public class BankAccount {
    //Attributes
    String accountHolderName;
    double balance;

    //Methods Get and Set
    public String GetAccountHolderName(){
        return this.accountHolderName;
    }
    public void SetAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public double GetBalance(){
        return this.balance;
    }
    public void SetBalance(double balance){
        this.balance = balance;
    }

    //Functions
    public void Deposit(double amount){
        if (amount>0)
            {balance += amount;}
    }
    public boolean Withdraw(double amount){
        if (amount>0 && amount<=balance)
            {
                balance -=amount;
                return true;
            }
        else
            {return false;}
    }
}
