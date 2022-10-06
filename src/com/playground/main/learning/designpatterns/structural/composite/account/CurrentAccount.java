package com.playground.main.learning.designpatterns.structural.composite.account;

public class CurrentAccount implements Account {
    @Override
    public void getType() {
        System.out.println("Current account!");
    }
}
