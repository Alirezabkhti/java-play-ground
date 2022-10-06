package com.playground.main.learning.designpatterns.structural.proxy.command;

import java.io.IOException;

public class DefaultCommandExecutor implements CommandExecutor {

    @Override
    public void runCommand(String command) throws IOException {
        Runtime.getRuntime().exec(command);
        System.out.println("'" + command + "' command executed.");
    }

}