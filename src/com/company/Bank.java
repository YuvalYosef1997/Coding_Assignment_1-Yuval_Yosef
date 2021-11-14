package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    private List<IAccount> AccountsLists;
    private List<IAccount> AccountsInDebt;
    private List<IAccount> AccountsWithBalance;

    // Constructor
    public Bank() {
        AccountsLists = new ArrayList<IAccount>();
        AccountsInDebt= new ArrayList<IAccount>();
        AccountsWithBalance= new ArrayList<IAccount>();
    }
    // Behaviour
    @Override
    public void OpenAccount(IAccount account)
    {
        AccountsLists.add(account);
    }
    @Override
    public void CloseAccount(int accountNumber)
    {
        for (int i = 0; i < AccountsLists.size(); i++)
        {
            IAccount actualAccount = AccountsLists.get(i);
            if (accountNumber == actualAccount.GetAccountNumber())
            {
                if (actualAccount.GetCurrentBalance() > 0)
                {
                    AccountsLists.remove(actualAccount);
                }
                else
                {
                    System.out.println("The account is not closed due to debt");
                }
            break;
            }
        }
    }
    @Override
    public List <IAccount> GetAllAccounts()
        {
            return AccountsLists;
        }
    @Override
    public List <IAccount> GetAllAccountsInDebt()
        {
            for (int i = 0; i < AccountsLists.size(); i++)
            {
                IAccount checkAccount = AccountsLists.get(i);
                if (checkAccount.GetCurrentBalance() <0)
                {
                    AccountsInDebt.add(checkAccount);
                }
            }
            return AccountsInDebt;
        }
    @Override
    public List <IAccount> GetAllAccountsWithBalance(double balanceAbove)
        {
            for (int i = 0; i < AccountsLists.size(); i++)
            {
                IAccount checkAccount = AccountsLists.get(i);
                if (checkAccount.GetCurrentBalance() > balanceAbove)
                {
                    AccountsWithBalance.add(checkAccount);
                }
            }
            return AccountsWithBalance;
        }

}

