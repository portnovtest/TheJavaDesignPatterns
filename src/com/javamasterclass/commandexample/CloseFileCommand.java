package com.javamasterclass.commandexample;

public class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}
