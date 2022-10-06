package com.playground.main.learning.designpatterns.structural.composite.account;

import java.util.ArrayList;
import java.util.List;

public class CompositeBankAccount implements Account{
    private List<Account> accounts = new ArrayList<>();

    @Override
    public void getType() {
        accounts.stream().forEach(Account::getType);
    }

    public void addAccount(Account account){
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }
}
