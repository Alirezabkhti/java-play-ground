package com.playground.main.learning.designpatterns.structural.bridge;

import com.playground.main.learning.designpatterns.structural.bridge.account.Account;
import com.playground.main.learning.designpatterns.structural.bridge.account.CurrentAccount;
import com.playground.main.learning.designpatterns.structural.bridge.bank.GovernmentalBank;

public class Main {
    public static void main(String[] args) {
        Account account = new GovernmentalBank(new CurrentAccount()).openAccount();
        account.getType();
    }
}
