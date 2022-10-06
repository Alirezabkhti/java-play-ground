package com.playground.main.learning.designpatterns.structural.bridge.bank;

import com.playground.main.learning.designpatterns.structural.bridge.account.Account;

public class NationalBank extends Bank {

    protected NationalBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("National Bank open account called!");
        return account;
    }
}
