package com.javamasterclass.commandexample;

public class Client {
    public static void main(String[] args) {
        // creating the receiver
        var fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        // create the command with the associating receiver
        var openFileCommand = new OpenFileCommand(fs);

        // create invoker and associate it with the command
        var file = new FileInvoker(openFileCommand);

        // perform action on invoker object
        file.execute();

        var writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        var closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
