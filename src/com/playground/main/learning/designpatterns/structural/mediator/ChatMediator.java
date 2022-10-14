package com.playground.main.learning.designpatterns.structural.mediator;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
