package com.playground.main.learning.designpatterns.creational.builder;

import com.playground.main.learning.designpatterns.creational.builder.account.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account.AccountBuilder(
                "Saving Account",
                "Alireza Bakhtiari",
                1111l
        )
                .withBalance(38458.32)
                .withInterest(4.5)
                .withType("SAVING")
                .build();
        System.out.println(account);
    }
}
