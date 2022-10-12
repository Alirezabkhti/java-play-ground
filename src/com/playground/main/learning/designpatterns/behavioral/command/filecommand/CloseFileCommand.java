package com.playground.main.learning.designpatterns.behavioral.command.filecommand;

import com.playground.main.learning.designpatterns.behavioral.command.filesystemreceiver.FileSystemReceiver;

public class CloseFileCommand implements Command{
    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        System.out.println("File is closed!");
    }
}
