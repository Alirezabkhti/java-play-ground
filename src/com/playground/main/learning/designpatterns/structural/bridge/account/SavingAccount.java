package com.playground.main.learning.designpatterns.structural.bridge.account;

public class SavingAccount implements Account{
    @Override
    public Account openAccount() {
        return new SavingAccount();
    }

    @Override
    public void getType() {
        System.out.println("This is a SavingAccount!");
    }
}
