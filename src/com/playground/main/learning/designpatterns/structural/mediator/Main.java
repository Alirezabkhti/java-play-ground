package com.playground.main.learning.designpatterns.structural.mediator;

/**
 * Define an object that encapsulates how a set of objects interact.
 * Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
 * Design an intermediary to decouple many peers.
 * Promote the many-to-many relationships between interacting peers to "full object status".
 */
public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new DefaultChatMediator();
        User user1 = new DefaultUser(mediator, "Alireza");
        User user2 = new DefaultUser(mediator, "Sara");
        User user3 = new DefaultUser(mediator, "Massi");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hi All");
    }
}
