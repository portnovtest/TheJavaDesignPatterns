package com.javamasterclass.commandexample;

public class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    // store previous state for undo, String someState

    public OpenFileCommand(FileSystemReceiver fs) {
        fileSystem = fs;
    }

    @Override
    public void execute() {
        // store previous state for undo, String someState
        this.fileSystem.openFile();
    }

    public void undo() {
        // restore previous state
        // myMemberVariable = previousState;
    }
}
