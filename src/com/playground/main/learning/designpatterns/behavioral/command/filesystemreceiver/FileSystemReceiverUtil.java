package com.playground.main.learning.designpatterns.behavioral.command.filesystemreceiver;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem(String osType) {
        System.out.println("Underlying OS is:" + osType);
        if (osType.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
