package com.playground.main.learning.designpatterns.structural.composite;

import com.playground.main.learning.designpatterns.structural.composite.account.Account;
import com.playground.main.learning.designpatterns.structural.composite.account.CompositeBankAccount;
import com.playground.main.learning.designpatterns.structural.composite.account.CurrentAccount;
import com.playground.main.learning.designpatterns.structural.composite.account.SavingAccount;

public class Main {
    public static void main(String[] args) {
        CompositeBankAccount compositeBankAccount = new CompositeBankAccount();
        Account account = new CurrentAccount();
        compositeBankAccount.addAccount(account);
        compositeBankAccount.addAccount(new SavingAccount());
        compositeBankAccount.getType();
        System.out.println("---------------------");
        compositeBankAccount.removeAccount(account);
        compositeBankAccount.getType();
    }
}
