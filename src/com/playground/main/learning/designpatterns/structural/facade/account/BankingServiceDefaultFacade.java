package com.playground.main.learning.designpatterns.structural.facade.account;

public class BankingServiceDefaultFacade implements BankingServiceFacade{
    @Override
    public void transferMoney() {
        if(PaymentService.doPayment()){
            Account fromAccount = AccountService.getAccount("1");
            Account toAccount = AccountService.getAccount("2");
            TransferService.transfer(1000, fromAccount, toAccount);
        }
    }
}