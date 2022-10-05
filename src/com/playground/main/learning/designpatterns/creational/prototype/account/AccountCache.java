package com.playground.main.learning.designpatterns.creational.prototype.account;

import java.util.HashMap;
import java.util.Map;

public class AccountCache {
    private static Map<String, Account> accountCache = new HashMap<>();

    static {
        accountCache.put("SAVING", new SavingAccount());
        accountCache.put("CURRENT", new CurrentAccount());
    }

    public static Map<String, Account> getAccountCache() {
        return accountCache;
    }
}
