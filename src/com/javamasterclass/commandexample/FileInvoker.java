package com.javamasterclass.commandexample;

public class FileInvoker {
    public Command command;

    public FileInvoker(Command c) {
        command = c;
    }

    public void execute() {
        command.execute();
    }
}
