package com.playground.main.learning.designpatterns.structural.facade.account;

public class TransferService {
    public static void transfer(int amount, Account fromAccount, Account toAccount) {
        System.out.println("Transferring Money");
    }
}
