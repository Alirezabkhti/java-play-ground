package com.playground.main.learning.designpatterns.structural.composite.account;

public class SavingAccount implements Account{
    @Override
    public void getType() {
        System.out.println("Saving account!");
    }
}
