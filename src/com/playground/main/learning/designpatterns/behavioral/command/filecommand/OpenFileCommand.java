package com.playground.main.learning.designpatterns.behavioral.command.filecommand;

import com.playground.main.learning.designpatterns.behavioral.command.filesystemreceiver.FileSystemReceiver;

public class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }

    @Override
    public void execute() {
        System.out.println("File now open!");
    }
}
