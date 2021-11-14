package com.company;

public class Main {

    public static void main(String[] args) {

    BasicAccount Yuval = new BasicAccount(208942441,100);
    Yuval.Deposit(200);
    Yuval.Withdraw(500);
    System.out.println(Yuval.GetCurrentBalance());

    }
}
