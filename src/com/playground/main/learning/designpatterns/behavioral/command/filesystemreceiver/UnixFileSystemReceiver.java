package com.playground.main.learning.designpatterns.behavioral.command.filesystemreceiver;

public class UnixFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Unix file open!");
    }

    @Override
    public void writeFile() {
        System.out.println("Unix file is written!");
    }

    @Override
    public void closeFile() {
        System.out.println("Unix file closed!");
    }
}