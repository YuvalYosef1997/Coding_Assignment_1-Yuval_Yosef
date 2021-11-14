package com.company;

public class StandardAccount implements IAccount {
    public int AccountNumber;
    public double CreditLimit;
    public double Balance;

    // Constructor
    public StandardAccount (int accountNumber, double creditLimit)
        {
            this.AccountNumber = accountNumber;
            this.CreditLimit = creditLimit;
            if (this.CreditLimit > 0)
            {
                this.CreditLimit =0;
            }
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
        if (amount<= maxWithdraw)
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
