package com.playground.main.learning.designpatterns.behavioral.command.filesystemreceiver;

public class WindowsFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Windows file open!");
    }

    @Override
    public void writeFile() {
        System.out.println("Windows file is written!");
    }

    @Override
    public void closeFile() {
        System.out.println("Windows file closed!");
    }
}
