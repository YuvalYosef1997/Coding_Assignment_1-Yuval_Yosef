package com.company;

public class PremiumAccount implements IAccount {
    public int AccountNumber;
    public double Balance;

    // Constructor
    public PremiumAccount (int accountNumber)
    {
        this.AccountNumber= accountNumber;
        this.Balance= 0;
    }
    // Behaviour
    @Override
    public void Deposit(double amount)
    {
        this.Balance += amount;
    }
    @Override
    public double Withdraw(double amount)
    {
        this.Balance -= amount;
        return amount;
    }
    @Override
    public double GetCurrentBalance()
    {
        return this.Balance;
    }
    @Override
    public int GetAccountNumber()
    {
        return this.AccountNumber;
    }





}
