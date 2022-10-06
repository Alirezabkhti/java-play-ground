package com.playground.main.learning.designpatterns.structural.proxy;

import com.playground.main.learning.designpatterns.structural.proxy.command.CommandExecutor;
import com.playground.main.learning.designpatterns.structural.proxy.command.CommandExecutorProxy;

public class main {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("alireza", "password");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }

    }
}
