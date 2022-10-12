package com.playground.main.learning.designpatterns.behavioral.command;

import com.playground.main.learning.designpatterns.behavioral.command.filecommand.CloseFileCommand;
import com.playground.main.learning.designpatterns.behavioral.command.filecommand.FileCommandInvoker;
import com.playground.main.learning.designpatterns.behavioral.command.filecommand.OpenFileCommand;
import com.playground.main.learning.designpatterns.behavioral.command.filecommand.WriteFileCommand;
import com.playground.main.learning.designpatterns.behavioral.command.filesystemreceiver.FileSystemReceiver;
import com.playground.main.learning.designpatterns.behavioral.command.filesystemreceiver.FileSystemReceiverUtil;

public class Main {
    public static void main(String[] args) {
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem("Windows");
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        FileCommandInvoker file = new FileCommandInvoker(openFileCommand);
        file.invokeCommand();
        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileCommandInvoker(writeFileCommand);
        file.invokeCommand();
        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileCommandInvoker(closeFileCommand);
        file.invokeCommand();
    }
}
