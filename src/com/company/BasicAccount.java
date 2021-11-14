package com.company;

public class BasicAccount implements IAccount {
    public int AccountNumber;
    public double WithdrawlLimit;
    public double Balance;
    public double CreditLimit;

    // Constructor
    public BasicAccount (int accountNumber,double withdrawlLimit)
    {
        this.AccountNumber= accountNumber;
        this.WithdrawlLimit= withdrawlLimit;
        this.CreditLimit= 0;
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
        double maxWithdraw= this.Balance-this.CreditLimit;
        if (amount>= this.WithdrawlLimit)
        {
            if (this.WithdrawlLimit <= maxWithdraw)
            {
                this.Balance -= this.WithdrawlLimit;
                return this.WithdrawlLimit;
            }
            else
            {
                this.Balance -= maxWithdraw;
                return maxWithdraw;
            }
        }
        else
        {
            if (amount <= maxWithdraw)
            {
                this.Balance -= amount;
                return amount;
            }
            else
            {
                this.Balance -= maxWithdraw;
                return maxWithdraw;
            }
        }
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
