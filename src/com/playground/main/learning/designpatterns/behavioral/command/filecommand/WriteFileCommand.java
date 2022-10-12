package com.playground.main.learning.designpatterns.behavioral.command.filecommand;

import com.playground.main.learning.designpatterns.behavioral.command.filesystemreceiver.FileSystemReceiver;

public class WriteFileCommand implements Command{
    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        System.out.println("Writing to file!!!");
    }
}
