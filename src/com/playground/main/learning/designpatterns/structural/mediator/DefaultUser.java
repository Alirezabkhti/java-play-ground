package com.playground.main.learning.designpatterns.structural.mediator;

public class DefaultUser implements User {
    private ChatMediator mediator;
    private String name;

    public DefaultUser(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        System.out.printf("%s sent %s %n", name, message);
        mediator.sendMessage(message,this);
    }

    @Override
    public void receivedMessage(String message) {
        System.out.printf("%s received %s %n", name, message);
    }
}
