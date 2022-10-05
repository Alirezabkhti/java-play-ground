package com.playground.main.learning.designpatterns.creational.prototype.account;

public abstract class Account implements Cloneable {
    public abstract void accountType();

    @Override
    public Account clone() {
        try {
            return (Account) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
