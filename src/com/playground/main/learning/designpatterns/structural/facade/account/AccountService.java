package com.playground.main.learning.designpatterns.structural.facade.account;

public class AccountService {
    public static Account getAccount(String accountId) {
        System.out.println(String.format("Getting Account with Id %s", accountId));
        return new SavingAccount();
    }
}
