package com.javamasterclass.commandexample;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem() {
        var osName = System.getProperty("os.name");
        System.out.println("Underlying OS is: " + osName);
        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
