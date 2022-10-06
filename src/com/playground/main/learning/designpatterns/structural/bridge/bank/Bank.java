package com.playground.main.learning.designpatterns.structural.bridge.bank;

import com.playground.main.learning.designpatterns.structural.bridge.account.Account;

public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public abstract Account openAccount();
}
