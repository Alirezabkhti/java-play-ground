package com.playground.main.learning.designpatterns.creational.prototype;

import com.playground.main.learning.designpatterns.creational.prototype.account.AccountCache;
import com.playground.main.learning.designpatterns.creational.prototype.account.CurrentAccount;
import com.playground.main.learning.designpatterns.creational.prototype.account.SavingAccount;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = (SavingAccount) AccountCache.getAccountCache().get("SAVING").clone();
        savingAccount.accountType();
        CurrentAccount currentAccount = (CurrentAccount) AccountCache.getAccountCache().get("CURRENT").clone();
        currentAccount.accountType();
    }
}
