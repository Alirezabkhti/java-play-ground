package com.playground.main.learning.designpatterns.behavioral.command.filecommand;

public class FileCommandInvoker {
    private Command command;

    public FileCommandInvoker(Command command) {
        this.command = command;
    }

    public void invokeCommand(){
        this.command.execute();
    }
}
