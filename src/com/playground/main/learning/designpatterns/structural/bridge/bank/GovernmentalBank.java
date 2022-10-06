package com.playground.main.learning.designpatterns.structural.bridge.bank;

import com.playground.main.learning.designpatterns.structural.bridge.account.Account;

public class GovernmentalBank extends Bank{
    public GovernmentalBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("Governmental Bank open account called!");
        return account;
    }
}
