package com.playground.main.learning.designpatterns.structural.bridge.account;

public class CurrentAccount implements Account{
    @Override
    public Account openAccount() {
        return new CurrentAccount();
    }

    @Override
    public void getType() {
        System.out.println("This is a CurrentAccount!");
    }
}
