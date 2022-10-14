package com.playground.main.learning.designpatterns.structural.mediator;

import java.util.ArrayList;
import java.util.List;

public class DefaultChatMediator implements ChatMediator {
    private List<User> users;

    public DefaultChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (!u.equals(user))
                u.receivedMessage(message);
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
