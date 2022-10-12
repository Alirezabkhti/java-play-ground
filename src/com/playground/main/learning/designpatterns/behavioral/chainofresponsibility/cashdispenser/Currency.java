package com.playground.main.learning.designpatterns.behavioral.chainofresponsibility.cashdispenser;

public class Currency {
    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
