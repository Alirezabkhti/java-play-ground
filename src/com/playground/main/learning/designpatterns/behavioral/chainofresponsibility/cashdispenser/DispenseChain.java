package com.playground.main.learning.designpatterns.behavioral.chainofresponsibility.cashdispenser;

public abstract class DispenseChain {
    protected DispenseChain dispenseChain;
    public abstract void setNextChain(DispenseChain dispenseChain);
    public abstract void dispense(Currency currency);
}
