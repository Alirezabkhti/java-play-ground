package com.playground.main.learning.designpatterns.structural.observer.numberobserver;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}