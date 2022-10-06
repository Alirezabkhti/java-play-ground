package com.playground.main.learning.designpatterns.structural.facade;

import com.playground.main.learning.designpatterns.structural.facade.account.BankingServiceDefaultFacade;
import com.playground.main.learning.designpatterns.structural.facade.account.BankingServiceFacade;

public class Main {
    public static void main(String[] args) {
        BankingServiceFacade serviceFacade = new BankingServiceDefaultFacade();
        serviceFacade.transferMoney();
    }
}
